package com.lance.hibernate.service;

import com.lance.hibernate.entity.CityEntity;
import com.lance.hibernate.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityRepository cityRepository;

    /**
     * findAll
     *
     * @return
     */
    public List<CityEntity> findAll() {
        return cityRepository.findAll();
    }

    /**
     * Save
     *
     * @param city
     */
    @Transactional
    public void save(CityEntity city) {
        cityRepository.save(city);
    }

    @Override
    public void delete(long id) {
        cityRepository.delete(id);
    }

    @Override
    public void delete(CityEntity city) {
        cityRepository.delete(city);
    }
}
