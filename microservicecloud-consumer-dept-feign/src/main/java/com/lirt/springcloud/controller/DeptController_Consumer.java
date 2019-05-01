package com.lirt.springcloud.controller;


import com.lirt.springcloud.entity.Dept;
import com.lirt.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: lirt
 * @Description:
 * @Date: Created in 23:17 2019/4/30
 */
@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService deptClientService;


    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.deptClientService.get(id);
    }

    @GetMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return this.deptClientService.list();
    }

    @PostMapping(value = "/consumer/dept/add")
    public Object add(Dept dept) {
        return this.deptClientService.add(dept);
    }

}
