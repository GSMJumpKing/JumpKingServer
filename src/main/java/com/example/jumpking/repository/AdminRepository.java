package com.example.jumpking.repository;

import com.example.jumpking.domain.Admin;

import java.util.*;

public interface AdminRepository {
    Admin save(Admin admin);
    Optional<Admin> findById(Long id);
    Optional<Admin> findByAdminId(String adminId);
    List<Admin> findAll();
}

