package commons.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public abstract class CoreException extends RuntimeException{

    private final ErrorCode code;

    public CoreException(ErrorCode code){
        super(code.name());
        this.code = code;
    }

    public CoreException(ErrorCode code, Throwable cause){
        super(code.name(), cause);
        this.code = code;
    }

    public ErrorCode getCode() {
        return this.code;
    }
}
