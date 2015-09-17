package com.pandawork.web.controller;

import com.pandawork.common.entity.User;
import com.pandawork.web.spring.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by chenyaosakai on 15/9/14.
 */
@Controller
@RequestMapping(value = "")
public class IndexController extends AbstractController{

    @RequestMapping(value = "toindex", method = RequestMethod.GET)
    public String toindex() {
        return "index";
    }
//
//    @RequestMapping(value = "index", method = RequestMethod.POST)
//    public String index() {
//        return "index";
//    }



}
