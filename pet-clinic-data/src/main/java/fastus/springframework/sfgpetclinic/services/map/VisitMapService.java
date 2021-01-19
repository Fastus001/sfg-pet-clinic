package fastus.springframework.sfgpetclinic.services.map;

import fastus.springframework.sfgpetclinic.model.Visit;
import fastus.springframework.sfgpetclinic.services.VisitService;

import java.util.Set;

/**
 * Created by Tom - 19.01.2021
 */
public class VisitMapService extends AbstractMapService<Visit,Long> implements VisitService {



    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet()==null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
        || visit.getPet().getOwner().getId()==null){
            throw  new RuntimeException("Invalid visit");
        }

        return super.save(visit);
    }

    @Override
    public void delete(Visit visit) {
        super.delete(visit);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
