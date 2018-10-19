package trlogic.springsfgpetclinic.model;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.io.Serializable;

public class BaseEntity implements Serializable{

    public ID getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;
}
