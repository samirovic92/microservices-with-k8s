package com.selidrissi.provider;

import com.selidrissi.domain.Department;
import com.selidrissi.domain.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentAdapter implements DepartmentRepository {
    private JpaDepartmentRepository jpaDepartmentRepository;

    public DepartmentAdapter(JpaDepartmentRepository jpaDepartmentRepository) {
        this.jpaDepartmentRepository = jpaDepartmentRepository;
    }

    @Override
    public Long save(Department department) {
        var departmentEntity = new DepartmentEntity(department.getName(), department.getAddress());
        var result = this.jpaDepartmentRepository.save(departmentEntity);
        return result.getId();
    }

    @Override
    public Department findById(Long departmentId) {
        return this.jpaDepartmentRepository.findById(departmentId)
                .map(DepartmentEntity::toDomain)
                .orElse(null);
    }

}
