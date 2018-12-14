package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model;

import javax.persistence.*;

public class Rating extends AbstractModel{

    private String type;

    private Dating dating;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Dating getDating() {
        return dating;
    }

    public void setDating(Dating dating) {
        this.dating = dating;
    }
}
