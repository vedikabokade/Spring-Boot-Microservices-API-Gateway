package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Department;
import com.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public Department saveDepartment(
            Department department) {

        return repository.save(department);
    }

    public List<Department> getAllDepartments() {

        return repository.findAll();
    }

    public Department getDepartmentById(Long id) {

        return repository.findById(id).orElse(null);
    }

    public Department updateDepartment(
            Long id,
            Department department) {

        Department existing =
                repository.findById(id).orElse(null);

        existing.setName(department.getName());

        existing.setLocation(
                department.getLocation());

        return repository.save(existing);
    }

    public void deleteDepartment(Long id) {

        repository.deleteById(id);
    }
}
