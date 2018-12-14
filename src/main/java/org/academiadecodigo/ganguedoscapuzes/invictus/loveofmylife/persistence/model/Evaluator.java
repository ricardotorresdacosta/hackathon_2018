package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

public class Evaluator extends AbstractModel {

    private String name;


    private List<Dating> datings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Dating> getDatings() {
        return datings;
    }

    public void setDatings(List<Dating> datings) {
        this.datings = datings;
    }


    @Override
    public String toString() {
        return "Evaluator{" +
                "name='" + name + '\'' +
                ", datings=" + datings +
                '}';
    }
}
