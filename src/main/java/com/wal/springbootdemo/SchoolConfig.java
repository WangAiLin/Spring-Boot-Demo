package com.wal.springbootdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * School配置类
 */
@Component
@ConfigurationProperties(prefix = "school")
public class SchoolConfig {
    Integer grade;
    Integer classnum;

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getClassnum() {
        return classnum;
    }

    public void setClassnum(Integer classnum) {
        this.classnum = classnum;
    }
}
