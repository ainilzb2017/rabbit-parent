package com.bfxy.rabbit.api.exception;

/**
 * 	$MessageRunTimeException
 * @author Alienware
 *
 */
public class MessageRunTimeException extends RuntimeException {


    private static final long serialVersionUID = -6764699987154111774L;

    public MessageRunTimeException() {
        super();
    }

    public MessageRunTimeException(String message) {
        super(message);
    }

    public MessageRunTimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MessageRunTimeException(Throwable cause) {
        super(cause);
    }
}
