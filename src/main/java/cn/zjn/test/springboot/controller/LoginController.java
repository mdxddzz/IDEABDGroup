package cn.zjn.test.springboot.controller;


import cn.zjn.test.springboot.domain.User;
import cn.zjn.test.springboot.annotationClass.UserLoginToken;
import cn.zjn.test.springboot.service.LoginService;
import cn.zjn.test.springboot.service.TokenService;
import cn.zjn.test.springboot.utils.JsonResult;
import cn.zjn.test.springboot.utils.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Zjn ; Bring it on !!!
 * @Date: 2021/1/4 0004 20:15
 * Note:
 */

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;

    @Autowired
    TokenService tokenService;

    @PostMapping("/userLogin")
    public JsonResult login(@RequestBody User user, HttpServletResponse response) {
        if (loginService.existUsername(user.getUSERNAME()) == 0) {
            return new JsonResult("500","用户名不存在");
        }
        if(!loginService.findPasswordByUsername(user.getUSERNAME()).get("password").equals(user.getPASSWORD())){
            return new JsonResult("500","密码错误");
        }
        else {
            Cookie cookie = new Cookie("token", tokenService.getToken(user));
            cookie.setPath("/");
            response.addCookie(cookie);

            return new JsonResult(loginService.findUserIdByUsername(user.getUSERNAME()),"200","登录成功");
        }
    }


    @UserLoginToken
    @RequestMapping(value = "/getMessage" ,method = RequestMethod.GET)
    public String getMessage() {

        // 取出token中带的用户id 进行操作
        System.out.println(TokenUtil.getTokenUserId());

        return "您已通过验证";
    }
}
