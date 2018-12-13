package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="ratingType")
public class Rating extends AbstractModel{

    private int fuckable;
}
