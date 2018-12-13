package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "date")
public class Date extends AbstractModel {

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "date_lover"
    )
    private Lover lover;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "date_evaluator"
    )
    private Lover evaluator;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "date_ratingtype"
    )
    private Rating ratingType;

    private int ratingValue;


    public Lover getLover() {
        return lover;
    }

    public void setLover(Lover lover) {
        this.lover = lover;
    }

    public Lover getEvaluator() {
        return evaluator;
    }

    public void setEvaluator(Lover evaluator) {
        this.evaluator = evaluator;
    }

    public Rating getRatingType() {
        return ratingType;
    }

    public void setRatingType(Rating ratingType) {
        this.ratingType = ratingType;
    }

    public int getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(int ratingValue) {
        this.ratingValue = ratingValue;
    }
}
