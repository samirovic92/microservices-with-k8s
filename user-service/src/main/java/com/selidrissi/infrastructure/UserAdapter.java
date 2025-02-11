package com.selidrissi.infrastructure;

import com.selidrissi.domain.Department;
import com.selidrissi.domain.User;
import com.selidrissi.domain.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserAdapter implements UserRepository {
    private JpaUserRepository jpaUserRepository;
    private RemoteDepartmentRepository departmentRepository;

    public UserAdapter(JpaUserRepository jpaUserRepository, RemoteDepartmentRepository departmentRepository) {
        this.jpaUserRepository = jpaUserRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public UUID save(User user) {
        var UserEntity = new UserEntity(
                user.getUserId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getDepartmentId()

        );
        var result = jpaUserRepository.save(UserEntity);
        return result.getUserId();
    }

    @Override
    public User getUserById(UUID userId) {
        return jpaUserRepository.findById(userId)
                .map(UserEntity::toDomain)
                .orElse(null);
    }

    @Override
    public Department getUserDepartment(Long departmentId) {
        return departmentRepository.getDepartmentById(departmentId);
    }

}
