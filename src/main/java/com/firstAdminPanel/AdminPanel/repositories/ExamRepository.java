package com.firstAdminPanel.AdminPanel.repositories;

import com.firstAdminPanel.AdminPanel.entities.AdminPanelExams;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<AdminPanelExams, Long> {
}
