package com.lance.querydsl.service;

import com.lance.querydsl.entity.CityEntity;

import java.util.List;

public interface CityService {

    /**
     * findAll
     *
     * @return
     */
    List<CityEntity> findAll(String hotelName);

    /**
     * Save
     *
     * @param city
     */
    void save(CityEntity city);

    void delete(long id);

    void delete(CityEntity city);
}
