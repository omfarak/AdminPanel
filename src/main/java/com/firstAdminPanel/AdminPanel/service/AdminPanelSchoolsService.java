package com.firstAdminPanel.AdminPanel.service;

import com.firstAdminPanel.AdminPanel.entities.AdminPanelSchools;

import java.util.List;

public interface AdminPanelSchoolsService {
    List<AdminPanelSchools> getAllSchools();
    AdminPanelSchools addSchool(AdminPanelSchools newSchool);


}
