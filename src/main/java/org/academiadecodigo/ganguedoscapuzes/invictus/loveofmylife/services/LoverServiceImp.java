package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.services;

import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.LoverDao;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Lover;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoverServiceImp implements LoverService{

    private LoverDao loverDao;

    @Autowired
    public void setLoverDao(LoverDao loverDao) {
        this.loverDao = loverDao;
    }

    @Override
    public List<Lover> list() {
        return loverDao.findAll();
    }

    @Override
    public Lover findById(Integer id) {
        return loverDao.findById(id);
    }

    @Override
    public Lover save(Lover model) {
        return loverDao.saveOrUpdate(model);
    }

    @Override
    public void delete(Lover model) {

        loverDao.delete(model.getId());
    }
}
