package com.pandawork.web.controller;

import com.pandawork.common.entity.Score;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.web.spring.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenyaosakai on 15/9/14.
 */
@Controller
@RequestMapping(value = "")
public class ScoreController extends AbstractController{
    @RequestMapping(value = "toscore", method = RequestMethod.GET)
    public String toScore(Model model) throws Exception {
        List<Score> list = new ArrayList<Score>();
        list = scoreService.listAll();
        for (int i = 0; i<list.size(); i++){
            int stuId = list.get(i).getStudentId();
            int leaId = list.get(i).getLeasonId();
            list.get(i).setStudentName(studentService.queryById(stuId).getStuName());
            list.get(i).setLeasonName(leasonService.queryById(leaId).getLeasonName());
        }
        model.addAttribute("scoreList",list);
        return "Score";
    }

    @RequestMapping(value = "newScore", method = RequestMethod.POST)
    public String newScore(HttpServletRequest request,Model model) throws Exception {
        String studName = request.getParameter("StudName");
        String leasName = request.getParameter("LeasName");
        Integer score = Integer.valueOf(request.getParameter("Score"));
        if(studentService.queryByName(studName)!=null&&leasonService.queryByName(leasName)!=null){
            Score score1 = new Score();
            score1.setLeasonName(leasName);
            score1.setStudentName(studName);
            score1.setScore(score);
            scoreService.insertScore(score1);
            List<Score> list = new ArrayList<Score>();
            list = scoreService.listAll();
            for (int i = 0; i<list.size(); i++){
                int stuId = list.get(i).getStudentId();
                int leaId = list.get(i).getLeasonId();
                list.get(i).setStudentName(studentService.queryById(stuId).getStuName());
                list.get(i).setLeasonName(leasonService.queryById(leaId).getLeasonName());
            }
            model.addAttribute("scoreList",list);
            return "Score";

        }else {
            return "wrong";
        }

    }
}
