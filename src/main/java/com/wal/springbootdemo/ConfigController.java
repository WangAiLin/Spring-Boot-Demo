package com.wal.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 读取配置类
 */
@RestController
public class ConfigController {

    @Resource
    SchoolConfig schoolConfig;

    @GetMapping({"/gradefromconfig"})
    public String gradeclass(){
        return "年级：" + schoolConfig.grade + " 班级：" + schoolConfig.classnum;
    }
}
