package com.pandawork.common.entity;

import com.pandawork.core.common.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User
 *
 * @author: mayuan
 * @time: 2015/8/19 9:15
 */
@Table(name = "t_user")
@Entity
public class User extends AbstractEntity {
    @Id
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "password")
    private String password;




}
