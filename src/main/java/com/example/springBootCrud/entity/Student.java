package com.example.springBootCrud.entity;

import lombok.Data;
import jakarta.persistence.*;


@Data
@Entity
@Table(name = "tbl_student")
public class Student {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String firstName;
    
    private String lastName;
    
    @Column(name = "email_address", unique = true)
    private String email;
}