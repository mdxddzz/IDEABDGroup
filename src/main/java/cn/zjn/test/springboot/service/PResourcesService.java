package cn.zjn.test.springboot.service;

import cn.zjn.test.springboot.domain.Page;
import cn.zjn.test.springboot.domain.Plan;

import java.util.List;
import java.util.Map;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/2/1 13:04
 * Note:
 */
public interface PResourcesService {
    List<Map> getPlan(String name, Page page);

    void addPlan(Plan plan);
}
