package com.selidrissi.api;

import com.selidrissi.api.DTO.CreatUserRequest;
import com.selidrissi.domain.UserInfo;
import com.selidrissi.domain.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UUID creatNewUser(@RequestBody CreatUserRequest creatUserRequest) {
        return userService.creatUser(creatUserRequest.toDomain());
    }

    @GetMapping("{userId}")
    public UserInfo getUserDetails(@PathVariable UUID userId) {
        return userService.getUserDetails(userId);
    }
}
