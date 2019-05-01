package com.lirt.springcloud.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author: lirt
 * @Description:
 * @Date: Created in 16:47 2019/4/30
 */
@Accessors(chain = true)
@Data
public class Dept {
    private Long  deptno;   //主键
    private String  dname;   //部门名称
    private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

}
