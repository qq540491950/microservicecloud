package com.lirt.springcloud.mapper;

import com.lirt.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: lirt
 * @Description:
 * @Date: Created in 17:00 2019/4/30
 */
@Mapper
public interface DeptMapper {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}
