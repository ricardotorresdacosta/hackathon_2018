package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.services;

import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.DateDao;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Dating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DateServiceImp implements DateService {

    private DateDao dateDao;

    @Autowired
    public void setDateDao(DateDao dateDao) {
        this.dateDao = dateDao;
    }

    @Override
    public List<Dating> list() {
        return dateDao.findAll();
    }

    @Override
    public Dating findById(Integer id) {
        return dateDao.findById(id);
    }

    @Override
    public Dating save(Dating model) {
        return dateDao.saveOrUpdate(model);
    }

    @Override
    public void delete(Dating model) {

        dateDao.delete(model.getId());

    }
}
