package com.dubbo.service.impl;

import com.dubbo.service.AsyncService;
import org.apache.dubbo.rpc.RpcContext;

import java.util.concurrent.CompletableFuture;

/**
 * @ClassName AsyncServiceImpl
 * @Description TODO
 * @Author xuery
 * @Date 2019/5/17 12:57
 * @Version 1.0
 */
public class AsyncServiceImpl implements AsyncService {

    @Override
    public CompletableFuture<String> sayHello(String name) {
        RpcContext savedContext = RpcContext.getContext();
        return CompletableFuture.supplyAsync(()->{
            System.out.println(savedContext.getAttachment("consumer-key1"));
            try{
                Thread.sleep(5000);
            }catch (Exception e){
                e.printStackTrace();
            }
            return "async repsonse from provider.";
        });

    }
}
