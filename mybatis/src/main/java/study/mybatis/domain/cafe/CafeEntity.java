package study.mybatis.domain.cafe;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CafeEntity {

	private String userId;
	private String name;
	private String info;
}
