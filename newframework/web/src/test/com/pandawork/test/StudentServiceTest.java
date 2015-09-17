package com.pandawork.test;

import com.pandawork.common.entity.Student;
import com.pandawork.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chenyaosakai on 15/9/11.
 */
public class StudentServiceTest extends AbstractTestCase {
    @Autowired
    private StudentService studentService;
    @Test
    public void newStu() throws Exception {
        Student student = new Student();
        student.setStuName("cmnaascc");
        student.setGrade("2");
        student.setClassId("12");
        studentService.newStu(student);
    }
    @Test
    public void delStu()throws Exception{
        studentService.delStu("wa");
    }
    @Test
    public void listAll()throws Exception{
        studentService.listAll();
    }
    @Test
    public void queryBuName()throws Exception{
        studentService.queryByName("ccc");
    }
    @Test
    public void queryListByName()throws Exception{
        studentService.queryListByName("n");
    }
}
