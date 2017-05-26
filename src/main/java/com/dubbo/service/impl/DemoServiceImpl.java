package com.dubbo.service.impl;

import com.dubbo.domain.Person;
import com.dubbo.service.DemoService;

/**
 * Created by 01368080 on 2017/4/28.
 */

class DemoServiceImpl implements DemoService {
    public Person get(int id) {
        return new Person(id, "charles`son", 4);
    }
}