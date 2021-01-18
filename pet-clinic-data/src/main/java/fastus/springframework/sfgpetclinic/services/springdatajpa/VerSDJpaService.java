package fastus.springframework.sfgpetclinic.services.springdatajpa;

import fastus.springframework.sfgpetclinic.model.Vet;
import fastus.springframework.sfgpetclinic.repositories.VetRepository;
import fastus.springframework.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Tom - 18.01.2021
 */
@Service
@Profile("springdatajpa")
public class VerSDJpaService implements VetService {

    private final VetRepository vetRepository;

    public VerSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
