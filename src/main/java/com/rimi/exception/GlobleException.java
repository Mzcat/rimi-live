package com.rimi.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.persistence.ExcludeDefaultListeners;
import java.io.ObjectInputStream;
import java.net.ConnectException;
import java.net.SocketTimeoutException;

/**
 * 用户处理全局异常的控制类
 */
@RestControllerAdvice
public class GlobleException {
    @ExceptionHandler(Exception.class)
    public String timeOutException(){
        return "服务器异常，请联系管理员";
    }

}
