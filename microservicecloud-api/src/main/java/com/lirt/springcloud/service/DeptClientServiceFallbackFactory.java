package com.lirt.springcloud.service;

import com.lirt.springcloud.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: lirt
 * @Description:
 * @Date: Created in 22:49 2019/5/1
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            public Dept get(long id)
            {
                return new Dept().setDeptno(id)
                        .setDname("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDb_source("no this database in MySQL");
            }

            public List<Dept> list()
            {
                return null;
            }

            public boolean add(Dept dept)
            {
                return false;
            }
        };

    }
}
