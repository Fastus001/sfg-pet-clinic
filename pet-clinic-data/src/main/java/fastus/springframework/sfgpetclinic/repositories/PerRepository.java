package fastus.springframework.sfgpetclinic.repositories;

import fastus.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Tom - 18.01.2021
 */
public interface PerRepository extends CrudRepository<Pet,Long> {
}
