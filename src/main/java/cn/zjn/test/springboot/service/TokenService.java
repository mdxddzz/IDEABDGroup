package cn.zjn.test.springboot.service;

import cn.zjn.test.springboot.domain.User;

/**
 * @Author: Zjn ; Bring it on !!!
 * @Date: 2021/1/11 0011 14:54
 * Note:
 */

public interface TokenService {
    String getToken(User user);
}
