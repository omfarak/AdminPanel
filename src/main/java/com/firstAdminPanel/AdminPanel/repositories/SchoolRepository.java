package com.firstAdminPanel.AdminPanel.repositories;

import com.firstAdminPanel.AdminPanel.entities.AdminPanelSchools;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<AdminPanelSchools, Long>{

}
