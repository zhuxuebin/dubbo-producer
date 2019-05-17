package com.dubbo.service.impl;

import com.dubbo.service.Test;
import org.apache.dubbo.rpc.RpcContext;

/**
 * Created by 01368080 on 2017/4/27.
 */
//@Service
public class TestImpl implements Test {
    /*
 * @authorShixy
 *@date  2016年1月5日
 * @seecom.dubbo.iservice.Test#sayHello(Java.lang.String)
 */
    public String sayHello(String message) {

        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("service say:" + message);
        String index = (String) RpcContext.getContext().getAttachment("index");
        System.out.println("index:"+index);
        return "welcome "+message;
    }
}
