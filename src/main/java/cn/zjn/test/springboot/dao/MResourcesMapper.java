package cn.zjn.test.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Map;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/2/1 14:26
 * Note:
 */
@Mapper
@Repository
public interface MResourcesMapper {
    //获取多人完成的任务ID和成员ID
    ArrayList<Map<String,String>> getUsers();

    //获取部分成员用户名
    ArrayList<Map<String,String>> getUserId();
}
