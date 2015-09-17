package com.pandawork.service;

import com.pandawork.common.entity.Student;
import com.pandawork.core.common.exception.SSException;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by chenyaosakai on 15/9/11.
 */
public interface StudentService {
    public void newStu(@Param("student") Student student) throws Exception;
    public void delStu(@Param("stuName") String stuName) throws Exception;
    public List<Student> listAll() throws Exception;
    public Student queryByName(@Param("stuName") String stuName) throws SSException;
    public List<Student> queryListByName(@Param("stuName") String stuName) throws Exception;
    public Student queryById(@Param("id")Integer id) throws Exception;

}
