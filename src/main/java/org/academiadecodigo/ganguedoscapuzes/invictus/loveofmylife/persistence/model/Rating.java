package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="ratingType")
public class Rating extends AbstractModel{

    private String type;
    private int score;

    @ManyToOne
    private Date date;
}
