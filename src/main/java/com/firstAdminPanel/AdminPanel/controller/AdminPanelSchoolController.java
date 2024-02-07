package com.firstAdminPanel.AdminPanel.controller;


import com.firstAdminPanel.AdminPanel.entities.AdminPanelSchools;
import com.firstAdminPanel.AdminPanel.service.AdminPanelSchoolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class AdminPanelSchoolController {


    @Autowired
    private AdminPanelSchoolsService schoolsService;


    @GetMapping("/schools")
    public List<AdminPanelSchools> getSchools(){
        return schoolsService.getAllSchools();
    }

    @PostMapping("/schools")
    public AdminPanelSchools addSchool(@RequestBody AdminPanelSchools newSchool){
        return schoolsService.addSchool(newSchool);
    }



}
