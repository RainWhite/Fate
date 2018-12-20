package com.my.fate.controller;

import com.my.fate.model.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author M.Y
 * @version 1.0
 * @date 2018/12/18 14:16
 */

@Slf4j
@RestController("LoginController")
public class LoginController extends GenericController {

//    @RequestMapping("/login")
//    public ModelAndView showLogin() {
//        return new ModelAndView("login.html");
//    }

    @RequestMapping("/login_p")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public RespBean login() {
        return RespBean.error("尚未登录，请登录!");
    }
}
