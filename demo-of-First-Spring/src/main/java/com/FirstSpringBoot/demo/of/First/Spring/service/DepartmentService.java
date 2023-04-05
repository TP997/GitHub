package com.FirstSpringBoot.demo.of.First.Spring.service;

import com.FirstSpringBoot.demo.of.First.Spring.entity.Department;
import com.FirstSpringBoot.demo.of.First.Spring.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
