package com.selidrissi.api.DTO;

import com.selidrissi.domain.Department;

public record CreateDepartmentRequest(
        String name,
        String address
) {

    public Department toDomain() {
        return new Department(name, address);
    }
}
