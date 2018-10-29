package trlogic.springsfgpetclinic.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AbstractMapService <T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(Long id){
        return map.get(id);
    }

    T save(Long id, T object){

         map.put((ID) id,object);

         return object;
    }

    void  deleteteById(Long id){
        map.remove(id);
    }
    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

}
