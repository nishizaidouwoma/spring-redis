package com.lzh.springboot_redis.error;

/**
 *
 */
public interface CommonError {
    public String getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String msg);
}
