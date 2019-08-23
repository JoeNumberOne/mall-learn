package com.joe.mall.tiny.comfig;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname MybaatisConfig
 * @Description MyBatis配置类
 * @Date 2019/8/22 14:19
 * @Created by maqiao-001
 */
@Configuration
@MapperScan({"com.joe.mall.tiny.mbg.mapper","com.joe.mall.tiny.dao"})
public class MyBatisConfig {
}
