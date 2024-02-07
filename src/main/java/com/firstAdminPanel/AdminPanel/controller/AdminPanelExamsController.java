package com.firstAdminPanel.AdminPanel.controller;

import com.firstAdminPanel.AdminPanel.entities.AdminPanelExams;
import com.firstAdminPanel.AdminPanel.service.AdminPanelExamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping()
public class AdminPanelExamsController {

    @Autowired
    private AdminPanelExamsService adminPanelExamsService;


    @GetMapping("/exams")
    public List<AdminPanelExams> getExams(){
        return adminPanelExamsService.getAllExams();
    }

    @PostMapping("/exams")
    public AdminPanelExams addExams(@RequestBody AdminPanelExams newExam){
        return adminPanelExamsService.addExams(newExam);
    }


}
