package com.example.jumpking.repository;

import com.example.jumpking.domain.Admin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MemoryAdminRepositoryTest {

    MemoryAdminRepository repository = new MemoryAdminRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    void save() {
        Admin admin = new Admin();
        admin.setAdminId("Admin");

        repository.save(admin);

        Admin result = repository.findById(admin.getId()).get();
        assertThat(admin).isEqualTo(result);
    }

    @Test
    void findByAdminId() {
        Admin admin1 = new Admin();
        Admin admin2 = new Admin();
        admin1.setAdminId("Admin1");
        admin2.setAdminId("Admin2");
        repository.save(admin1);
        repository.save(admin2);

        Admin result = repository.findByAdminId("Admin1").get();
        assertThat(admin1).isEqualTo(result);
    }

    @Test
    void findAll() {
        Admin admin1 = new Admin();
        Admin admin2 = new Admin();
        admin1.setAdminId("Admin1");
        admin2.setAdminId("Admin2");
        repository.save(admin1);
        repository.save(admin2);

        List<Admin> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);

    }
}