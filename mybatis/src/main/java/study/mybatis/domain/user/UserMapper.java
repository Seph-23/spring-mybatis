package study.mybatis.domain.user;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

	public List<UserEntity> findAll();

	public Optional<UserEntity> findById(Long userId);

	public void updateUserInfo(UserEntity userEntity);
}
