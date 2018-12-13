package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.services;

import java.util.List;

public interface CRUDService<T> {

    List<T> list();

    T findById(Integer id);

    T save(T model);

    void delete(T model);
}
