package cn.zjn.test.springboot.service;


import cn.zjn.test.springboot.domain.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/2/1 16:11
 * Note:
 */
public interface MResourcesService {
    ArrayList<Map<String,String>> getUsers();

    ArrayList<Map<String,String>> getUserId();
}
