package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.jpa;

import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.LoverDao;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.ProfileDao;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Lover;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Profile;
import org.springframework.stereotype.Repository;

@Repository
public class JpaProfileDao extends AbstractJpaDao<Profile> implements ProfileDao {

    public JpaProfileDao() {
        super(Profile.class);
    }
}
