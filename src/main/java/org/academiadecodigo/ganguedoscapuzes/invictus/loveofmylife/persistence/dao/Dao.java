package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.dao;

import java.util.List;

public interface Dao<T> {
    List<T> findAll();

    T findById(Integer id);

    T saveOrUpdate(T model);

    void delete(Integer id);
}
