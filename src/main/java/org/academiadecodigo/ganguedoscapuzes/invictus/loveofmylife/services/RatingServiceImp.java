package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.services;

import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.RatingDao;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImp implements RatingService {

    @Autowired
    public void setRatingDao(RatingDao ratingDao) {
        this.ratingDao = ratingDao;
    }

    private RatingDao ratingDao;

    @Override
    public List<Rating> list() {
        return ratingDao.findAll();
    }

    @Override
    public Rating findById(Integer id) {
        return ratingDao.findById(id);
    }

    @Override
    public Rating save(Rating model) {
        return ratingDao.saveOrUpdate(model);
    }

    @Override
    public void delete(Rating model) {
        ratingDao.delete(model.getId());
    }
}
