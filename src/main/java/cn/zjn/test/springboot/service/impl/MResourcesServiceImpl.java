package cn.zjn.test.springboot.service.impl;

import cn.zjn.test.springboot.dao.MResourcesMapper;
import cn.zjn.test.springboot.service.MResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/2/1 16:11
 * Note:
 */
@Service("MResourcesService")
public class MResourcesServiceImpl implements MResourcesService {
    @Autowired
    MResourcesMapper mResourcesMapper;

    @Override
    public ArrayList<Map<String, String>> getUsers() {
        return mResourcesMapper.getUsers();
    }


    @Override
    public ArrayList<Map<String,String>> getUserId() {
        return mResourcesMapper.getUserId();
    }
}
