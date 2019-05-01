package com.lirt.springcloud.service;

import com.lirt.springcloud.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: lirt
 * @Description:
 * @Date: Created in 17:58 2019/5/1
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @GetMapping(value = "/dept/get/{id}")
    Dept get(@PathVariable("id") long id);

    @GetMapping(value = "/dept/list")
    List<Dept> list();

    @PostMapping(value = "/dept/add")
    boolean add(Dept dept);
}

