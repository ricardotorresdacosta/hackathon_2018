package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "date")
public class Date extends AbstractModel {

    @ManyToOne
    private Lover lover;

    @ManyToOne
    private Evaluator evaluator;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "date"
    )
    private List<Rating> rating;

    public Lover getLover() {
        return lover;
    }

    public void setLover(Lover lover) {
        this.lover = lover;
    }

    public Evaluator getEvaluator() {
        return evaluator;
    }

    public void setEvaluator(Evaluator evaluator) {
        this.evaluator = evaluator;
    }

    public List<Rating> getRating() {
        return rating;
    }

    public void setRating(List<Rating> rating) {
        this.rating = rating;
    }
}
