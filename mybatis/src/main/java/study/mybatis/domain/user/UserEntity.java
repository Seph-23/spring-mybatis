package study.mybatis.domain.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserEntity {

    private Long userId;
    private String name;
    private String email;
}
