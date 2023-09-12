package study.mybatis.domain.cafe;

import org.apache.ibatis.annotations.Mapper;

import study.mybatis.api.cafe.controller.dto.CafeCreateRequestDTO;

@Mapper
public interface CafeMapper {
	public void createCafe(CafeCreateRequestDTO cafeCreateRequestDTO);
}
