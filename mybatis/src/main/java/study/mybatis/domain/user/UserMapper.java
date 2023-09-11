package study.mybatis.domain.user;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {

    public List<UserEntity> findAll();

    public Optional<UserEntity> findById(Long userId);

    public void updateUserInfo(UserEntity userEntity);
}
