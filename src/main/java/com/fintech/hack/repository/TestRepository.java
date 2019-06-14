package com.fintech.hack.repository;

import com.fintech.hack.domain.TestEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends CrudRepository<TestEntity, Long> {
    List<TestEntity> findAll();
}
