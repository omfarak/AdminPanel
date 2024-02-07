package com.firstAdminPanel.AdminPanel.service;

import com.firstAdminPanel.AdminPanel.entities.AdminPanelSchools;
import com.firstAdminPanel.AdminPanel.repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AdminPanelSchoolsServiceImpl implements AdminPanelSchoolsService {


    @Autowired
    private SchoolRepository schoolRepository;


    @Override
    public List<AdminPanelSchools> getAllSchools() {
        return schoolRepository.findAll();
    }

    @Override
    public AdminPanelSchools addSchool(@RequestBody AdminPanelSchools newSchool) {
        return schoolRepository.save(newSchool);
    }
}
