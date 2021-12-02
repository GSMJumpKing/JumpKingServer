package com.example.jumpking.service;

import com.example.jumpking.domain.Admin;
import com.example.jumpking.repository.AdminRepository;
import com.example.jumpking.repository.MemoryAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class AdminService {

    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    // 회원가입 (안쓸거 같은데)
    public Long join(Admin admin) {
        validateDuplicateAdmin(admin); //중복 회원 검증
        adminRepository.save(admin);
        return admin.getId();
    }

    private void validateDuplicateAdmin(Admin admin) {
        adminRepository.findById(admin.getId())
            .ifPresent(a -> {  // ifPresent 어떤 값이 있으면
                throw new IllegalStateException("이미 존재하는 회원입니다.");
            });
    }
    // 전체회원 조회
    public List<Admin> findAdmins() {
        return adminRepository.findAll();
    }

    public Optional<Admin> findOne(Long adminId) {
        return adminRepository.findById(adminId);
    }

    public void add() {
    }
}
