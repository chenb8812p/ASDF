package com.pandawork.web.controller;
import com.pandawork.common.entity.User;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
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
@SessionAttributes("currentUser")
public class LoginController extends AbstractController {


    @RequestMapping(value = "tologin", method = RequestMethod.GET)
    public String toLogin(){
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(User user, Model model){
        try{
            if(userService.checkLogin(user)){
                String userName = user.getUserName();
                try{
                    User user1 = userService.queryByUserName(userName);
                    model.addAttribute("currentUser",user1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return "index";
            }else {
                return "wrong";
            }
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }



}
