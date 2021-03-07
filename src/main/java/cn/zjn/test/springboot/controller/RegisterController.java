package cn.zjn.test.springboot.controller;

import cn.zjn.test.springboot.domain.User;
import cn.zjn.test.springboot.service.LoginService;
import cn.zjn.test.springboot.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/1/31 12:05
 * Note:
 */
@RestController
public class RegisterController {
    @Autowired
    LoginService loginService;

    @PostMapping("/userReg")
    public JsonResult register(@RequestBody User user){

        try {
            loginService.regisUser(user);
        } catch (Exception e) {
            return new JsonResult<>("500","1");
        }
        return new JsonResult(loginService.findUserIdByUsername(user.getUSERNAME()));
    }
}
