package com.lzh.springboot_redis.controller;

import com.lzh.springboot_redis.error.BusinessException;
import com.lzh.springboot_redis.response.CommonReturnType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
@Slf4j
public class BaseController {
    @ExceptionHandler
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object handlerException(HttpServletRequest request,Exception ex){
        Map<String,Object> requstMap=new HashMap<>();
        if(ex instanceof BusinessException){
            BusinessException businessException= (BusinessException) ex;
            requstMap.put("errCode",businessException.getErrCode());
            requstMap.put("errMsg",businessException.getErrMsg());
        }else {
            log.error("系统异常:",ex);
            requstMap.put("errCode","");
            requstMap.put("errMsg","");
        }
        return CommonReturnType.create(requstMap,"fal");
    }
}
