package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.domain.Foo;
import com.dubbo.service.FooService;

import java.util.Date;

/**
 * Created by 01368080 on 2017/4/28.
 */
//@Service("fooservice")
public class FooServiceImpl implements FooService {
    @Override
    public Foo findFoo(int id) {
        try {
            Thread.sleep(500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return new Foo(2,new Date(),"foolMan");
    }
}
