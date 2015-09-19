package com.pandawork.web.controller;

import com.pandawork.common.entity.Student;
import com.pandawork.web.spring.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenyaosakai on 15/9/14.
 */
@Controller
@RequestMapping(value = "")
@SessionAttributes("currentStudent")
public class StudentController extends AbstractController {
    @RequestMapping(value = "tostudent", method = RequestMethod.GET)
    public String toStudent(Model model) throws Exception {
        List<Student> list = new ArrayList<Student>();
        list = studentService.listAll();

        model.addAttribute("list",list);
        return "Student";
    }

    @RequestMapping(value = "queryStu" , method = RequestMethod.POST)
    public String queryStu(HttpServletRequest request,Model model) throws Exception {
        String stuName = request.getParameter("stuName");
        if (stuName == null || stuName == "") {
            List<Student> list = new ArrayList<Student>();
            list = studentService.listAll();
            model.addAttribute("list", list);
            return "Student";
        }
        else if(studentService.queryListByName(stuName) == null){
            return "wrong";
        }
        else {
            List<Student> list = new ArrayList<Student>();
            list = studentService.queryListByName(stuName);
            model.addAttribute("list", list);
            return "Student";
        }
    }

    @RequestMapping(value = "newStu", method = RequestMethod.POST)
    public String newStu(HttpServletRequest request,Model model) throws Exception {
        String studName = request.getParameter("studName");
        String grade = request.getParameter("grade");
        String classId = request.getParameter("classid");

        if(studName!=null&&grade!=null&&classId!=null&&studName!=""&&grade!=""&&classId!=""&&studentService.queryByName(studName)==null){
            Student student = new Student();
            student.setStuName(studName);
            student.setGrade(grade);
            student.setClassId(classId);
            studentService.newStu(student);

            List<Student> list = new ArrayList<Student>();
            list = studentService.listAll();
            model.addAttribute("list", list);
            return "Student";

        }else{
            return "wrong";
        }
    }

    @RequestMapping(value = "delStu", method = RequestMethod.GET)
    public String delStu(HttpServletRequest request,Model model) throws Exception {

        String studentName = request.getParameter("studentName");
        studentService.delStu(studentName);
        List<Student> list = new ArrayList<Student>();
        list = studentService.listAll();
        model.addAttribute("list", list);
        return "Student";
    }

}
