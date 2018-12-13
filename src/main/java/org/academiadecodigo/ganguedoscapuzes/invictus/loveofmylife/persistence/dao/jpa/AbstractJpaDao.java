package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.jpa;

import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class AbstractJpaDao<T> implements Dao<T> {

    private Class<T> modelType;

    @PersistenceContext
    private EntityManager em;

    public AbstractJpaDao(Class<T> modelType) {
        this.modelType = modelType;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<T> findAll() {
        return em.createQuery("from " + modelType.getSimpleName(), modelType).getResultList();
    }

    @Override
    public T findById(Integer id) {
        return em.find(modelType, id);
    }


    @Override
    public T saveOrUpdate(T model) {
        return em.merge(model);
    }

    @Override
    public void delete(Integer id) {

        T model = em.find(modelType, id);

        em.remove(model);


    }
}
