package trlogic.springsfgpetclinic.service.map;

import com.sun.xml.internal.bind.v2.model.core.ID;
import trlogic.springsfgpetclinic.model.Vet;
import trlogic.springsfgpetclinic.service.CrudService;

import java.util.Set;

public class VetServiceMap extends  AbstractMapService<Vet,ID> implements CrudService<Vet,Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteteById(id);

    }
}
