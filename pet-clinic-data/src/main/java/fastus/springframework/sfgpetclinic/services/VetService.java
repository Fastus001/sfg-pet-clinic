package fastus.springframework.sfgpetclinic.services;

import fastus.springframework.sfgpetclinic.model.Pet;
import fastus.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Pet pet);

    Set<Vet> findAll();
}
