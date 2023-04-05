package com.FirstSpringBoot.demo.of.First.Spring.service;

import com.FirstSpringBoot.demo.of.First.Spring.entity.Department;
import com.FirstSpringBoot.demo.of.First.Spring.repository.DepartmentRepository;
import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {
    @Autowired
    private DepartmentService departmentService;
    @MockBean
    private DepartmentRepository departmentRepository;
    @BeforeEach
    void setUp() {
        Department department= Department.builder().departmentName("IT").departmentAddress("Banglore").departmentCode("IT").departmentId(1L).build();
        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT")).thenReturn(department);

    }
    @Test
    @DisplayName("Get Data based on Valid Department Name")
    @Disabled
    public void whenValidDepartmentName_thenDepartmentShouldFound(){
        String departmentnName="IT";
        Department found = departmentService.fetchDepartmentByName(departmentnName);
        assertEquals(departmentnName,found.getDepartmentName());
    }
}