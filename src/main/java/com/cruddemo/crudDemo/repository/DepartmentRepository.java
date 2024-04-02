package com.cruddemo.crudDemo.repository;

import com.cruddemo.crudDemo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
