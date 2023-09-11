package study.mybatis.api.user.service;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mybatis.domain.UserDTO;
import study.mybatis.domain.UserMapper;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final SqlSessionTemplate sqlSession;

    @Transactional(readOnly = true)
    public List<UserDTO> findAll() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.findAll();
    }

    @Transactional(readOnly = true)
    public UserDTO findById(Long userId) {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.findById(userId);
    }
}
