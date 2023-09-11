package study.mybatis.domain;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<UserDTO> findAll();

    public UserDTO findById(Long userId);
}
