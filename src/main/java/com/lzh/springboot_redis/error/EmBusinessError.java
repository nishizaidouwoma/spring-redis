package com.lzh.springboot_redis.error;

public enum EmBusinessError implements CommonError{
    ;
    private String errCode;
    private String errMsg;

    EmBusinessError(String errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    @Override
    public String getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String msg) {
        this.errMsg=msg;
        return this;
    }
}
