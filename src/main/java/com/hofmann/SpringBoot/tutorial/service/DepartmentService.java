package com.hofmann.SpringBoot.tutorial.service;

import com.hofmann.SpringBoot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);
}
