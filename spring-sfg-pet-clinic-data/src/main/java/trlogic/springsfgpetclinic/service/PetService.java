package trlogic.springsfgpetclinic.service;

import trlogic.springsfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(long id);

    Pet saveOwner(long id);

    Pet Save(Pet pet);

    Set<Pet> findall();
}
