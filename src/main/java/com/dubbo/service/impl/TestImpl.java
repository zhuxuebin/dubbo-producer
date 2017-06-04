package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.dubbo.service.Test;

/**
 * Created by 01368080 on 2017/4/27.
 */
@Service(version = "1.0.0")
public class TestImpl implements Test {
    /*
 * @authorShixy
 *@date  2016年1月5日
 * @seecom.dubbo.iservice.Test#sayHello(Java.lang.String)
 */
    public String sayHello(String message) {
        System.out.println("service say:" + message);
        String index = (String)RpcContext.getContext().getAttachment("index");
        System.out.println("index:"+index);
        return "welcome "+message;
    }
}
