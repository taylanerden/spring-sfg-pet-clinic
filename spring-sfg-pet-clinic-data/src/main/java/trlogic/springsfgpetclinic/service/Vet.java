package trlogic.springsfgpetclinic.service;

import java.util.Set;

public interface Vet {

    Vet findById(long id);

    Vet saveOwner(long id);

    Vet Save(Vet Vet);

    Set<Vet> findall();
}
