package cn.zjn.test.springboot.dao;

import cn.zjn.test.springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;


/**
 * @Author: Zjn ; Bring it on !!!
 * @Date: 2021/1/4 0004 20:15
 * Note:
 */
@Mapper
@Repository
public interface UserMapper {
    //通过用户名查找密码
    Map<String,Object> findPasswordByUsername(String username);

    //通过用户ID查找密码
    User findPasswordByUserId(String id);

    //注册用户
    Integer regisUser(User user);

    //通过用户ID查询是否有该用户
    Integer existUsername(String name);

    String findUserIdByUsername(String username);
}
