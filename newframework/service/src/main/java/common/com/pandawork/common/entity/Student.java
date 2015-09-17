package com.pandawork.common.entity;

import com.pandawork.core.common.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by chenyaosakai on 15/9/11.
 */
@Entity
@Table(name = "t_student")
public class Student extends AbstractEntity{
    @Id
    private Integer id;
    @Column(name = "stu_name")
    private String stuName;
    @Column(name = "grade")
    private String grade;
    @Column(name = "class_id")
    private String classId;

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getClassId() {
        return classId;
    }


}
