package com.FirstSpringBoot.demo.of.First.Spring.repository;


import com.FirstSpringBoot.demo.of.First.Spring.entity.Department;
import com.FirstSpringBoot.demo.of.First.Spring.service.DepartmentService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    public Department findByDepartmentName(String departmentName);

  //to ignore the case of the name from the table
    public Department findByDepartmentNameIgnoreCase(String departmentName);
}
