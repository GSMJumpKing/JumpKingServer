package com.example.jumpking.controller;

import com.example.jumpking.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final AdminService adminService;

    @Autowired
    public Controller(AdminService adminService) {
        this.adminService = adminService;
    }

}
