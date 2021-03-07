package cn.zjn.test.springboot.service;

import cn.zjn.test.springboot.domain.Task;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/2/2 12:56
 * Note:
 */
public interface TaskService {
    ArrayList<String> findUserIn(Task task);

    void updateStatus(Task task);
}
