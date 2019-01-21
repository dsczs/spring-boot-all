package com.lance.hibernate.service;

import com.lance.hibernate.entity.CityEntity;

import java.util.List;

public interface CityService {

    /**
     * findAll
     *
     * @return
     */
    List<CityEntity> findAll();

    /**
     * Save
     *
     * @param city
     */
    void save(CityEntity city);

    void delete(long id);

    void delete(CityEntity city);
}
