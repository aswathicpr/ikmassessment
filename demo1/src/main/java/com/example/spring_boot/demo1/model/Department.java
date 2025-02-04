package com.example.spring_boot.demo1.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data

public class Department {

    private String deptname;
    
}
