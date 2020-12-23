package com.lzh.springboot_redis.error;

public class BusinessException  extends Exception implements CommonError{
    private CommonError commonError;
    public  BusinessException(CommonError commonError){
        super();
        this.commonError=commonError;
    }
    public BusinessException (CommonError commonError ,String msg){
        super();
        this.commonError=commonError;
        this.commonError.setErrMsg(msg);
    }
    @Override
    public String getErrCode() {
        return  this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return  this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String msg) {
        this.commonError.setErrMsg(msg);
        return this;
    }
}
