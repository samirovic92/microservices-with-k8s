package com.selidrissi.api;

import com.selidrissi.api.DTO.CreateDepartmentRequest;
import com.selidrissi.domain.Department;
import com.selidrissi.domain.DepartmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public Long createDepartment(@RequestBody CreateDepartmentRequest request) {
        return this.departmentService.saveDepartment(request.toDomain());
    }

    @GetMapping("{departmentId}")
    public Department findById(@PathVariable Long departmentId) {
        return this.departmentService.findById(departmentId);
    }
}
