package com.appsdev.app.sensordatademoapplication.controller;

import com.appsdev.app.sensordatademoapplication.entity.Department;
import com.appsdev.app.sensordatademoapplication.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

@Autowired private DepartmentService departmentService;
    @GetMapping
    public String getDepartmentController() {
        return "Welcome To DepartmentController!!!!";
    }

    // Save operation
    @PostMapping("/departments")
    public Department saveDepartment(
       @RequestBody Department department)
    {
        return departmentService.saveDepartment(department);
    }

    // Read operation
    @GetMapping("/departments")

    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }

    // Update operation
    @PutMapping("/departments/{id}")

    public Department
    updateDepartment(@RequestBody Department department,
                     @PathVariable("id") Long departmentId)
    {
        return departmentService.updateDepartment(
                department, departmentId);
    }

    // Delete operation
    @DeleteMapping("/departments/{id}")

    public String deleteDepartmentById(@PathVariable("id")
                                       Long departmentId)
    {
        departmentService.deleteDepartmentById(
                departmentId);
        return "Deleted Successfully";
    }


}
