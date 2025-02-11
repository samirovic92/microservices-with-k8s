package com.selidrissi.api.DTO;

import com.selidrissi.domain.User;

import java.util.UUID;

public record CreatUserRequest(
        String firstName,
        String lastName,
        String email,
        Long departmentId
) {
    public User toDomain() {
        return new User(
                UUID.randomUUID(),
                firstName,
                lastName,
                email,
                departmentId
        );
    }
}
