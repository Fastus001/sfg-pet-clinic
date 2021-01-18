package fastus.springframework.sfgpetclinic.repositories;

import fastus.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Tom - 18.01.2021
 */
public interface VisitRepository extends CrudRepository<Visit,Long> {

}
