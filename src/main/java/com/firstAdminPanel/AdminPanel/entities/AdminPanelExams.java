package com.firstAdminPanel.AdminPanel.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "exams")
public class AdminPanelExams {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long examId;

    String examName;
    String examTitle;
    //Exam type like A2 - C1
    String examDuration;
    float examPrice;
    @Lob
    @Column(columnDefinition = "text")
    String examDescription;





}
