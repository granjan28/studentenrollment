package com.demo.studentenrollment.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String major;
    private String phone;
    private String imageURL;
    @Column(nullable = false, updatable = false)
    private String studentCode;
}
