package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.jpa;

import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.RatingDao;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Rating;
import org.springframework.stereotype.Repository;

@Repository
public class JpaRatingDao extends AbstractJpaDao<Rating> implements RatingDao {
    public JpaRatingDao() {
        super(Rating.class);
    }
}
