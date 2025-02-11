package com.selidrissi.domain;

import java.util.UUID;

public class User {
    private UUID userId;
    private String firstName;
    private String lastName;
    private String email;
    private Long departmentId;

    public User(UUID userId, String firstName, String lastName, String email, Long departmentId) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.departmentId = departmentId;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Long getDepartmentId() {
        return departmentId;
    }
}
