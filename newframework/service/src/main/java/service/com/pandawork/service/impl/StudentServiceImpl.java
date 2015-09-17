package com.pandawork.service.impl;

import com.pandawork.common.entity.Student;
import com.pandawork.common.utils.NFException;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.mapper.StudentMapper;
import com.pandawork.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenyaosakai on 15/9/11.
 */
@Service("StudentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public void newStu(@Param("student") Student student) throws Exception {
        if (Assert.isNull(student)) {
            return ;
        }

        // 判断用户名和密码是否为空
        Assert.isNotNull(student.getStuName(), NFException.UserNameNotNull);
        Assert.isNotNull(student.getGrade(), NFException.PasswordNotNull);
        Assert.isNotNull(student.getClassId(),NFException.PasswordNotNull);

        try {
            studentMapper.newStu(student);
            return ;
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    public void delStu(@Param("stuName") String stuName) throws Exception {
        try {
            studentMapper.delStu(stuName);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    public List<Student> listAll() throws Exception {
        try {
            return studentMapper.listAll();
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    public Student queryByName(@Param("stuName") String stuName) throws SSException {
        if (Assert.isNull(stuName)) {
            return null;
        }
        try {
            return studentMapper.queryByName(stuName);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    public List<Student> queryListByName(@Param("stuName") String stuName) throws Exception {
        try {
            return studentMapper.queryListByName(stuName);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }    }

    @Override
    public Student queryById(@Param("id") Integer id) throws Exception {
        if (Assert.lessOrEqualZero(id)) {
            return null;
        }
        try {
            return studentMapper.queryById(id);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }    }
}
