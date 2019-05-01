package com.lirt.springcloud.service.impl;

import com.lirt.springcloud.entity.Dept;
import com.lirt.springcloud.mapper.DeptMapper;
import com.lirt.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lirt
 * @Description:
 * @Date: Created in 17:04 2019/4/30
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper deptMapper;

    @Override
    public boolean add(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptMapper.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.findAll();
    }
}
