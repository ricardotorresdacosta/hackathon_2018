package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


public class Dating extends AbstractModel {

    private int score;

    private Lover lover;


    private Evaluator evaluator;


    private Rating rating;


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

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Dating{" +
                "score=" + score +
                ", lover=" + lover +
                ", evaluator=" + evaluator +
                ", rating=" + rating +
                '}';
    }
}
