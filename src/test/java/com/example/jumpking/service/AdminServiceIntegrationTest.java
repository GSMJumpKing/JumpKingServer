package com.example.jumpking.service;

import com.example.jumpking.domain.Admin;
import com.example.jumpking.repository.AdminRepository;
import com.example.jumpking.repository.MemoryAdminRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class AdminServiceIntegrationTest {

    @Autowired AdminService adminService;
    @Autowired AdminRepository adminRepository;

    @Test
    void 회원가입() {
        //given
        Admin admin = new Admin();
        admin.setAdminId("Admin");
        //when
        Long saveId = adminService.join(admin);
        //then
        Admin findAdmin = adminService.findOne(saveId).get();
    }

    @Test
    void 중복에러() {
        //given
        Admin admin1 = new Admin();
        Admin admin2 = new Admin();
        admin1.setAdminId("Admin");
        admin2.setAdminId("Admin");
        //when
        adminService.join(admin1);
        IllegalStateException err = assertThrows(IllegalStateException.class, () -> adminService.join(admin2));

        assertThat(err.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
        //then
    }

    @Test
    void 전체어드민조회() {
        //given

        //when

        //then
    }

    @Test
    void findOne() {
        //given

        //when

        //then
    }
}