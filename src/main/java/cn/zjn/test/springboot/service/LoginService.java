package cn.zjn.test.springboot.service;

import cn.zjn.test.springboot.domain.User;

import java.util.List;
import java.util.Map;

public interface LoginService { //当使用@Autowired注解的时候，其实默认就是@Autowired(required=true)

    Map<String,Object> findPasswordByUsername(String username);

    User findPasswordByUserId(String userId);

    void regisUser(User user);

    Integer existUsername(String name);

    String findUserIdByUsername(String username);
}
