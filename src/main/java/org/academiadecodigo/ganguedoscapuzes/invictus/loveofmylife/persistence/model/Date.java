package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="date")
public class Date extends AbstractModel{

    @OneToOne
    private Lover lover;

    @OneToOne
    private Lover evaluator;

    @OneToMany
    private Rating ratingType;

    @OneToMany
    private int ratingValue;
}
