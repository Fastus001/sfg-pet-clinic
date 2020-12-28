package fastus.springframework.sfgpetclinic.services.map;

import fastus.springframework.sfgpetclinic.model.Speciality;
import fastus.springframework.sfgpetclinic.services.SpecialitiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Tom - 28.12.2020
 */
@Service
public class SpecialityMapService extends AbstractMapService<Speciality,Long> implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
