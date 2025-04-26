package com.appsdev.app.sensordatademoapplication.repository;

import com.appsdev.app.sensordatademoapplication.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
