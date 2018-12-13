package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.jpa;

import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.LoverDao;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Lover;
import org.springframework.stereotype.Repository;

@Repository
public class JpaLoverDao extends AbstractJpaDao<Lover> implements LoverDao {
    public JpaLoverDao() {
        super(Lover.class);
    }
}
