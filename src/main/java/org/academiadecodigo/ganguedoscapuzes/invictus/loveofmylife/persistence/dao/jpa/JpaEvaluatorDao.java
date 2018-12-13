package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.jpa;

import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.EvaluatorDao;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Evaluator;

public class JpaEvaluatorDao extends AbstractJpaDao<Evaluator> implements EvaluatorDao {
    public JpaEvaluatorDao() {
        super(Evaluator.class);
    }
}
