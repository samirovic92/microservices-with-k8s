package com.selidrissi.infrastructure;


import com.selidrissi.domain.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "department-service", url = "${department.url}")
public interface RemoteDepartmentRepository {

    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable Long id);
}
