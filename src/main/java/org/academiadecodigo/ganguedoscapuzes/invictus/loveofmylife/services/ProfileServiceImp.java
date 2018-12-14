package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.services;

import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.ProfileDao;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileServiceImp implements ProfileService{

    private ProfileDao profileDao;

    @Autowired
    public void setProfileDao(ProfileDao profileDao) {
        this.profileDao = profileDao;
    }

    @Override
    public List<Profile> list() {
        return profileDao.findAll();
    }

    @Override
    public Profile findById(Integer id) {
        return profileDao.findById(id);
    }

    @Override
    public Profile save(Profile model) {
        return profileDao.saveOrUpdate(model);
    }

    @Override
    public void delete(Profile model) {

        profileDao.delete(model.getId());
    }
}
