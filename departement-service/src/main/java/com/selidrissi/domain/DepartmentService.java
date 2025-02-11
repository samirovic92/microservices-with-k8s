package com.selidrissi.domain;

import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Long saveDepartment(Department department) {
        return this.departmentRepository.save(department);
    }

    public Department findById(Long departmentId) {
        return this.departmentRepository.findById(departmentId);
    }
}
