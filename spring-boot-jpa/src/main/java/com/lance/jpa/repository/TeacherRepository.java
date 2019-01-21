package com.lance.jpa.repository;

import com.lance.jpa.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

    /**
     * findByName
     *
     * @param name
     * @return
     */
    List<Teacher> findByName(String name);
}
