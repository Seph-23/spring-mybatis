package study.mybatis.api.cafe.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import study.mybatis.api.cafe.controller.dto.CafeCreateRequestDTO;
import study.mybatis.domain.cafe.CafeMapper;

@Service
@Transactional
@RequiredArgsConstructor
public class CafeService {

	private final SqlSessionTemplate sqlSession;

	public void createCafe(CafeCreateRequestDTO cafeCreateRequestDTO) {
		CafeMapper cafeMapper = sqlSession.getMapper(CafeMapper.class);
		cafeMapper.createCafe(cafeCreateRequestDTO);
	}
}
