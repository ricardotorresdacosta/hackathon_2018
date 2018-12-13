package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.services;

import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.EvaluatorDao;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Evaluator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluatorServiceImp implements  EvaluatorService{

    @Autowired
    public void setEvaluatorDao(EvaluatorDao evaluatorDao) {
        this.evaluatorDao = evaluatorDao;
    }

    private EvaluatorDao evaluatorDao;

    @Override
    public List<Evaluator> list() {
        return evaluatorDao.findAll();
    }

    @Override
    public Evaluator findById(Integer id) {
        return evaluatorDao.findById(id);
    }

    @Override
    public Evaluator save(Evaluator model) {
        return evaluatorDao.saveOrUpdate(model);
    }

    @Override
    public void delete(Evaluator model) {

        evaluatorDao.delete(model.getId());
    }
}
