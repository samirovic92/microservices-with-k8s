package com.selidrissi.domain;

public interface DepartmentRepository {

    Long save(Department department);

    Department findById(Long departmentId);
}
