package com.selidrissi.infrastructure;

import com.selidrissi.domain.Department;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class DepartmentEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;

    public DepartmentEntity() {
    }

    public DepartmentEntity(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Department toDomain() {
        return new Department(
                id, name, address
        );
    }
}
