package com.pandawork.web.controller;

import com.pandawork.common.entity.Leason;
import com.pandawork.web.spring.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenyaosakai on 15/9/14.
 */
@Controller
@RequestMapping(value = "")
@SessionAttributes("currentLeason")
public class LeasonController extends AbstractController {
    @RequestMapping(value = "toleason", method = RequestMethod.GET)
    public String toLeason(Model model) throws Exception {
        List<Leason> leasonList = new ArrayList<Leason>();
        leasonList = leasonService.listAll();
        model.addAttribute("leasonList", leasonList);
        String a = leasonList.get(0).getLeasonName();
        return "Leason";
    }
}
