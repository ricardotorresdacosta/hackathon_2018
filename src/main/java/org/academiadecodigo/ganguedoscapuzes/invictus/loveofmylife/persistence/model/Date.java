package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "date")
public class Date extends AbstractModel {

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "date_lover"
    )
    private List<Lover> lovers;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "date_evaluator"
    )
    private List<Lover> evaluators;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "date_ratingtype"
    )
    private List<Rating> ratingTypes;

    private int ratingValue;

    public List<Lover> getLovers() {
        return lovers;
    }

    public void setLovers(List<Lover> lovers) {
        this.lovers = lovers;
    }

    public List<Lover> getEvaluators() {
        return evaluators;
    }

    public void setEvaluators(List<Lover> evaluators) {
        this.evaluators = evaluators;
    }

    public List<Rating> getRatingTypes() {
        return ratingTypes;
    }

    public void setRatingTypes(List<Rating> ratingTypes) {
        this.ratingTypes = ratingTypes;
    }

    public int getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(int ratingValue) {
        this.ratingValue = ratingValue;
    }
}
