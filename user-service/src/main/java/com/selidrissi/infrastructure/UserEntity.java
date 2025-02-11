package com.selidrissi.infrastructure;

import com.selidrissi.domain.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class UserEntity {
    @Id
    private UUID userId;
    private String firstName;
    private String lastName;
    private String email;
    private Long departmentId;

    public UserEntity() {
    }

    public UserEntity(UUID userId, String firstName, String lastName, String email, Long departmentId) {
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

    public User toDomain() {
        return new User(
                userId, firstName, lastName, email, departmentId
        );
    }
}
