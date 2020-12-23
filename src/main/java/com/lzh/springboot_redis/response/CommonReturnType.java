package com.lzh.springboot_redis.response;

import lombok.Data;

/**
 * 通用返回对象
 * @author liuzihao
 */
@Data
public class CommonReturnType {
    private String status;
    private Object data;
    public static  CommonReturnType create(Object data){
        return CommonReturnType.create(data,"success");
    }
    public static CommonReturnType create(Object data,String status){
        CommonReturnType commonReturnType=new CommonReturnType();
        commonReturnType.setData(data);
        commonReturnType.setStatus(status);
        return commonReturnType;
    }
}
