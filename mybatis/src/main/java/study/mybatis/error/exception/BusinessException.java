package study.mybatis.error.exception;

import lombok.Getter;
import study.mybatis.error.ErrorCode;

@Getter
public class BusinessException extends RuntimeException {

	private ErrorCode errorCode;

	public BusinessException(ErrorCode errorCode) {
		super(errorCode.getMessage());
		this.errorCode = errorCode;
	}
}
