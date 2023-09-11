package study.mybatis.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    //회원
    USER_DOES_NOT_EXIST(HttpStatus.BAD_REQUEST, "U-001", "존재하지 않는 회원입니다.")
    ;

    private HttpStatus httpStatus;
    private String errorCode;
    private String message;

    ErrorCode(final HttpStatus httpStatus, final String errorCode, final String message) {
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.message = message;
    }
}
