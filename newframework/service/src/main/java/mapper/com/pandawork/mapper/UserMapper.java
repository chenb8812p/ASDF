package com.pandawork.mapper;

import com.pandawork.common.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Created by chenyaosakai on 15/8/31.
 */
public interface UserMapper {

    public void newUser(@Param("user") User user) throws Exception;

    public int countByUserNameAndPassword(@Param("userName") String userName,
                                          @Param("password") String password) throws Exception;

    public User queryByUserName(@Param("userName") String userName) throws  Exception;

    public User queryById(@Param("id") int id) throws Exception;

    public List<User> listAll() throws Exception;
    public void deleteById(@Param("id") int id) throws Exception;
    public void update(@Param("user") User user) throws Exception;
}
