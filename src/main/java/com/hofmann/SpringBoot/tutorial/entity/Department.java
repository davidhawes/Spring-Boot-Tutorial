package com.hofmann.SpringBoot.tutorial.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long departmentId;

    @NotBlank(message = "Please add a Department Name")
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;


}
