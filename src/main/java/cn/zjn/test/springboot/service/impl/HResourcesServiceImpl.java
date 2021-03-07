package cn.zjn.test.springboot.service.impl;

import cn.zjn.test.springboot.dao.HResourcesMapper;
import cn.zjn.test.springboot.domain.Page;
import cn.zjn.test.springboot.domain.Task;
import cn.zjn.test.springboot.service.HResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/1/31 16:26
 * Note:
 */
@Service("ResourcesService")
public class HResourcesServiceImpl implements HResourcesService {
    @Autowired
    HResourcesMapper resourcesMapper;

    @Override
    public List<Map<String,Object>> getTask(Page page) {
        return resourcesMapper.getTask(page);
    }

    @Override
    public List<Map<String, Object>> getLast(Page page) {
        return resourcesMapper.getLast(page);
    }
}
