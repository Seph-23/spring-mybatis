package study.mybatis.api.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.mybatis.api.user.controller.dto.UserUpdateRequestDTO;
import study.mybatis.api.user.service.UserService;
import study.mybatis.domain.user.UserEntity;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @GetMapping("/userList")
    public ResponseEntity<List<UserEntity>> userList() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserEntity> userInfo(@PathVariable("id") Long userId) {
        return ResponseEntity.ok(userService.findById(userId));
    }

    @PatchMapping("/user/{id}")
    public ResponseEntity<String> updateUserInfo(@PathVariable("id") Long userId,
                                                 @RequestBody UserUpdateRequestDTO userUpdateRequestDTO) {
        userService.updateUserInfo(userId, userUpdateRequestDTO);
        return ResponseEntity.ok("User Info Updated!");
    }
}
