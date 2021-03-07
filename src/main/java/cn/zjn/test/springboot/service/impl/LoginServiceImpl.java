package cn.zjn.test.springboot.service.impl;

import cn.zjn.test.springboot.dao.UserMapper;
import cn.zjn.test.springboot.domain.User;
import cn.zjn.test.springboot.service.LoginService;
import cn.zjn.test.springboot.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/1/30 16:25
 * Note:
 */
@Service("LoginService")
public class LoginServiceImpl implements LoginService {
    @Autowired
    UserMapper userMapper;

    public Map<String,Object> findPasswordByUsername(String username) {
        return userMapper.findPasswordByUsername(username);
    }

    @Override
    public User findPasswordByUserId(String userId) {
        return userMapper.findPasswordByUserId(userId);
    }

    @Override
    public void regisUser(User user) {
        userMapper.regisUser(user);
    }

    @Override
    public String findUserIdByUsername(String username) {
        return userMapper.findUserIdByUsername(username);
    }

    @Override
    public Integer existUsername(String name) {
        return userMapper.existUsername(name);
    }
}
