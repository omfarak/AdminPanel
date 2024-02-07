package com.firstAdminPanel.AdminPanel.service;

import com.firstAdminPanel.AdminPanel.entities.AdminPanelExams;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface AdminPanelExamsService {

    List<AdminPanelExams> getAllExams();

    AdminPanelExams addExams(@RequestBody AdminPanelExams newExam);



}
