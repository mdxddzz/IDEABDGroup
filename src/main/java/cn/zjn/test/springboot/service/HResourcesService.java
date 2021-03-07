package cn.zjn.test.springboot.service;

import cn.zjn.test.springboot.domain.Page;
import cn.zjn.test.springboot.domain.Task;

import java.util.List;
import java.util.Map;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/1/31 19:08
 * Note:
 */
public interface HResourcesService {
    List<Map<String,Object>> getTask(Page page);

    List<Map<String,Object>> getLast(Page page);
}
