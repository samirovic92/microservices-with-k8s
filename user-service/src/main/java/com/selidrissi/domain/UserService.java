package com.selidrissi.domain;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UUID creatUser(User user) {
        return userRepository.save(user);
    }

    public UserInfo getUserDetails(UUID userId) {
        var user = userRepository.getUserById(userId);
        var department = userRepository.getUserDepartment(user.getDepartmentId());
        return new UserInfo(user, department);
    }
}
