package com.selidrissi.domain;

import java.util.UUID;

public interface UserRepository {
    UUID save(User user);
    User getUserById(UUID userId);
    Department getUserDepartment(Long departmentId);
}
