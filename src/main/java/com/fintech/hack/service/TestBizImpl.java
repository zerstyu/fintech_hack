package com.fintech.hack.service;

import com.fintech.hack.domain.TestEntity;
import com.fintech.hack.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestBizImpl implements TestBiz {

    @Autowired
    private TestRepository testRepository;

    @Override
    public List<TestEntity> getAllTestEntityList() {
        return testRepository.findAll();
    }
}
