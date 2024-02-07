package com.firstAdminPanel.AdminPanel.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "schools")
@Data
public class AdminPanelSchools {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long schoolId;

    String schoolName;
    String schoolPhoneNumber;

    String schoolEmail;

    String schoolAdress;
    String schoolCity;



}
