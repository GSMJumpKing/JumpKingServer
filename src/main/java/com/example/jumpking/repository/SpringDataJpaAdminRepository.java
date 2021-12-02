package com.example.jumpking.repository;

import com.example.jumpking.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaAdminRepository extends JpaRepository<Admin,
        Long>, AdminRepository {
    Optional<Admin> findByAdminId(String name);
}
