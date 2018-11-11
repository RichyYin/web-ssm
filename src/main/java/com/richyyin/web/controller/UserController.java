package com.richyyin.web.controller;

import com.richyyin.web.module.User;
import com.richyyin.web.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yyq
 * @date 2018-11-10
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LogManager.getLogger(UserController.class);

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/name")
    @ResponseBody
    public Map<String, Object> getUserName(User user, HttpServletRequest request) {
        logger.info("get user name");

        Map<String, Object> map = new HashMap<>(1);

        User myUser = userService.getByUserId(1);

        if (myUser != null) {
            map.put("result", "success");
            map.put("name", myUser.getName());
        } else {
            map.put("result", "fail");
        }

        return map;
    }

    @RequestMapping("/success")
    public String success(@RequestParam("name") String name) {
        logger.info("get user[" + name + "] success");

        return "success";
    }
}
