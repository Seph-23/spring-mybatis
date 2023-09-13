package study.mybatis.api.user.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import study.mybatis.api.user.controller.dto.UserUpdateRequestDTO;
import study.mybatis.api.user.service.UserService;
import study.mybatis.domain.user.UserEntity;

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
