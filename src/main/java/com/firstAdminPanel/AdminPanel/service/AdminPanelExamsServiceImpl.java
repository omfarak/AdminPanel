package com.firstAdminPanel.AdminPanel.service;

import com.firstAdminPanel.AdminPanel.entities.AdminPanelExams;
import com.firstAdminPanel.AdminPanel.repositories.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminPanelExamsServiceImpl implements AdminPanelExamsService{


    @Autowired
    private ExamRepository examRepository;

    @Override
    public List<AdminPanelExams> getAllExams() {
        return examRepository.findAll();
    }

    @Override
    public AdminPanelExams addExams(AdminPanelExams newExam) {
        return examRepository.save(newExam);
    }
}
