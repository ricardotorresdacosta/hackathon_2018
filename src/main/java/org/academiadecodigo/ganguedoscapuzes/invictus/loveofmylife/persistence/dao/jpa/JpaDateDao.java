package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.jpa;

import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.DateDao;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Date;
import org.springframework.stereotype.Repository;

@Repository
public class JpaDateDao extends AbstractJpaDao<Date> implements DateDao {
    public JpaDateDao() {
        super(Date.class);
    }
}
