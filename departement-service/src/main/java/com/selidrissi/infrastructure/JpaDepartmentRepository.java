package com.selidrissi.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaDepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
}
