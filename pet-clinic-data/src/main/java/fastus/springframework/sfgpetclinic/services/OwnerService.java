package fastus.springframework.sfgpetclinic.services;

import fastus.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);
}
