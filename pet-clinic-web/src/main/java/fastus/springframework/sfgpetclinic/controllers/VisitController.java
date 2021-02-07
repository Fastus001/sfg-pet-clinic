package fastus.springframework.sfgpetclinic.controllers;

import fastus.springframework.sfgpetclinic.model.Pet;
import fastus.springframework.sfgpetclinic.model.Visit;
import fastus.springframework.sfgpetclinic.services.PetService;
import fastus.springframework.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by Tom - 07.02.2021
 */
@Controller
public class VisitController {
    private static final String PETS_CREATE_OR_UPDATE_VISIT_FORM = "pets/createOrUpdateVisitForm";
    private final VisitService visitService;
    private final PetService petService;

    public VisitController(VisitService visitService, PetService petService) {
        this.visitService = visitService;
        this.petService = petService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder){
        dataBinder.setDisallowedFields("id");
    }

    @ModelAttribute("visit")
    public Visit loadPetWithVisit(@PathVariable("petId") Long petId, Map<String, Object> model){
        Pet pet = petService.findById(petId);
        model.put("pet", pet);
        Visit visit = Visit.builder().build();
        pet.getVisits().add(visit);
        visit.setPet(pet);
        return visit;
    }

    //spring MVC calls method load PetWithVisit(...) before initNewVisitForm is called
    @GetMapping("/owners/*/pets/{petId}/visits/new")
    public String initNewVisitForm(@PathVariable Long petId, Map<String, Object> model){
        return PETS_CREATE_OR_UPDATE_VISIT_FORM;
    }

    //spring MVC calls method loadPetWithVisit(..) before processNewVisitForm is called
    @PostMapping("/owners/{ownerId]/pets/{petId}/visits/new")
    public String processNewVisitForm(@Valid Visit visit, BindingResult result){
        if(result.hasErrors()){
            return PETS_CREATE_OR_UPDATE_VISIT_FORM;
        }else {
            visitService.save(visit);
            return "redirect:/owners/" + visit.getPet().getOwner().getId();
        }
    }



}
