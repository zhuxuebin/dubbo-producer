package com.dubbo.service.impl;

import com.dubbo.domain.Bar;
import com.dubbo.service.BarService;

/**
 * Created by 01368080 on 2017/4/28.
 */
//@Service("barservice")
public class BarServiceImpl implements BarService {
    @Override
    public Bar findBar(int id) {
        try {
            Thread.sleep(600);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return new Bar(1,"xuery");
    }
}
