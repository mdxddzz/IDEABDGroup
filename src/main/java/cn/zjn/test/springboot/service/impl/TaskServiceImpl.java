package cn.zjn.test.springboot.service.impl;

import cn.zjn.test.springboot.dao.TaskMapper;
import cn.zjn.test.springboot.domain.Task;
import cn.zjn.test.springboot.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/2/2 12:56
 * Note:
 */
@Service("TaskService")
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskMapper taskMapper;

    @Override
    public ArrayList<String> findUserIn(Task task) {
        return taskMapper.findUserIn(task);
    }

    @Override
    public void updateStatus(Task task) {
        taskMapper.updateStatus(task);
    }
}
