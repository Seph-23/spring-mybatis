package study.mybatis.api.cafe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import study.mybatis.api.cafe.controller.dto.CafeCreateRequestDTO;
import study.mybatis.api.cafe.service.CafeService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CafeController {

	private final CafeService cafeService;

	@PostMapping("/cafe")
	public ResponseEntity<String> createCafe(@RequestBody CafeCreateRequestDTO cafeCreateRequestDTO) {
		cafeService.createCafe(cafeCreateRequestDTO);
		return ResponseEntity.ok("Cafe Creation Successful!");
	}
}
