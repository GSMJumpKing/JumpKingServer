package com.example.jumpking.repository;

import com.example.jumpking.domain.Admin;

import java.util.*;

public class MemoryAdminRepository implements AdminRepository{

    private static Map<Long, Admin> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Admin save(Admin admin) {
        admin.setId(++sequence);
        store.put(admin.getId(),admin);
        return admin;
    }

    @Override
    public Optional<Admin> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Admin> findByAdminId(String adminId) {
        return store.values().stream()
                .filter(admin -> admin.getAdminId().equals(adminId))
                .findAny();
    }

    @Override
    public List<Admin> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
