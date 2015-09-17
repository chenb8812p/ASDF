package com.pandawork.mapper;

import com.pandawork.common.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by chenyaosakai on 15/9/11.
 */
public interface StudentMapper {
    public void newStu(@Param("student") Student student) throws Exception;//suc
    public void delStu(@Param("stuName") String stuName) throws Exception;//suc
    public List<Student> listAll() throws Exception;//suc
    public Student queryByName(@Param("stuName") String stuName)throws Exception;
    public List<Student> queryListByName(@Param("stuName") String stuName) throws Exception;
    public Student queryById(@Param("id")Integer id) throws Exception;
}
