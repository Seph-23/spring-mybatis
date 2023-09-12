package study.mybatis.api.user.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import study.mybatis.api.user.controller.dto.UserUpdateRequestDTO;
import study.mybatis.domain.user.UserEntity;
import study.mybatis.domain.user.UserMapper;
import study.mybatis.error.ErrorCode;
import study.mybatis.error.exception.BusinessException;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

	private final SqlSessionTemplate sqlSession;

	@Transactional(readOnly = true)
	public List<UserEntity> findAll() {
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		return userMapper.findAll();
	}

	@Transactional(readOnly = true)
	public UserEntity findById(Long userId) {
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		return userMapper.findById(userId).orElseThrow(() -> new BusinessException(ErrorCode.USER_DOES_NOT_EXIST));
	}

	public void updateUserInfo(Long userId, UserUpdateRequestDTO userUpdateRequestDTO) {
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		UserEntity userEntity = UserEntity.builder()
			.userId(userId)
			.name(userUpdateRequestDTO.getName())
			.email(userUpdateRequestDTO.getEmail())
			.build();
		userMapper.updateUserInfo(userEntity);
	}
}
