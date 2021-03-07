package cn.zjn.test.springboot.service.impl;

import cn.zjn.test.springboot.dao.PResourcesMapper;
import cn.zjn.test.springboot.domain.Page;
import cn.zjn.test.springboot.domain.Plan;
import cn.zjn.test.springboot.service.PResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/2/1 13:04
 * Note:
 */
@Service("PResourcesService")
public class PResourcesServiceImpl implements PResourcesService {
    @Autowired
    PResourcesMapper pResourcesMapper;

    @Override
    public List<Map> getPlan(String name, Page page) {
        return pResourcesMapper.getPlan(name,page);
    }

    @Override
    public void addPlan(Plan plan) {
        pResourcesMapper.addPlan(plan);
    }
}
