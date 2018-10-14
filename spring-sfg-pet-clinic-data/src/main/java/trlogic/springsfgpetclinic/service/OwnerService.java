package trlogic.springsfgpetclinic.service;

import trlogic.springsfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(long id);

    Owner saveOwner(long id);

    Owner Save(Owner owner);

    Set<Owner>  findall();
}
