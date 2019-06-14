package com.fintech.hack;

import com.fintech.hack.domain.TestEntity;
import com.fintech.hack.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HackApplication implements CommandLineRunner {

    @Autowired
    private TestRepository testRepository;

    public static void main(String[] args) {
        SpringApplication.run(HackApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testRepository.save(getTestEntity());
    }

    private TestEntity getTestEntity(){
        TestEntity testEntity = new TestEntity();
        testEntity.setName("재홍");
        return testEntity;
    }
}
