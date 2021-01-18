package fastus.springframework.sfgpetclinic.repositories;

import fastus.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Tom - 18.01.2021
 */
public interface OwnerRepository extends CrudRepository<Owner,Long> {

    Owner findByLastName(String lastName);

}
