package com.example.jumpking;

import com.example.jumpking.repository.AdminRepository;
import com.example.jumpking.repository.MemoryAdminRepository;
import com.example.jumpking.service.AdminService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final AdminRepository adminRepository;

    public SpringConfig(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

//    @Bean
//    public AdminRepository adminRepository() {
//        return new MemoryAdminRepository();
//    }

    @Bean
    public AdminService adminService() {
        return new AdminService(adminRepository);
    }

    }
