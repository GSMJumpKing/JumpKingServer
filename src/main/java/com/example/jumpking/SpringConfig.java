package com.example.jumpking;

import com.example.jumpking.repository.AdminRepository;
import com.example.jumpking.repository.MemoryAdminRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public AdminRepository adminRepository() {
        return new MemoryAdminRepository();
    }


}
