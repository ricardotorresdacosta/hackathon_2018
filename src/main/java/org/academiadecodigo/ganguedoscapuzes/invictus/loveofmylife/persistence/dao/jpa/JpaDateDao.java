package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.jpa;

import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.DateDao;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Dating;
import org.springframework.stereotype.Repository;

@Repository
public class JpaDateDao extends AbstractJpaDao<Dating> implements DateDao {
    public JpaDateDao() {
        super(Dating.class);
    }
}
