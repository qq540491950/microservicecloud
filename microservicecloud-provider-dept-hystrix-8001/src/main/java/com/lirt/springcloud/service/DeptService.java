package com.lirt.springcloud.service;

import com.lirt.springcloud.entity.Dept;

import java.util.List;

/**
 * @Author: lirt
 * @Description:
 * @Date: Created in 17:04 2019/4/30
 */
public interface DeptService {

    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();
}

