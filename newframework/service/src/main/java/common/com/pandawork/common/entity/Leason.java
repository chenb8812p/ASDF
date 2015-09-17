package com.pandawork.common.entity;

import com.pandawork.core.common.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by chenyaosakai on 15/9/11.
 */
@Table(name = "t_leason")
@Entity
public class Leason extends AbstractEntity{
    @Id
    private Integer id;
    @Column(name = "leason_name")
    private String leasonName;
    @Column(name = "teacher")
    private String teacher;

    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getLeasonName() {
        return leasonName;
    }

    public void setLeasonName(String leasonName) {
        this.leasonName = leasonName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
