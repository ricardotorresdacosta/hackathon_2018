package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.services;

import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.DateDao;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Date;
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
    public List<Date> list() {
        return dateDao.findAll();
    }

    @Override
    public Date findById(Integer id) {
        return dateDao.findById(id);
    }

    @Override
    public Date save(Date model) {
        return dateDao.saveOrUpdate(model);
    }

    @Override
    public void delete(Date model) {

        dateDao.delete(model.getId());

    }
}
