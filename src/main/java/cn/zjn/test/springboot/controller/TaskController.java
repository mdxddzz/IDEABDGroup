package cn.zjn.test.springboot.controller;

import cn.zjn.test.springboot.annotationClass.PriInfoToken;
import cn.zjn.test.springboot.domain.Task;
import cn.zjn.test.springboot.service.TaskService;
import cn.zjn.test.springboot.utils.JsonResult;
import cn.zjn.test.springboot.utils.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/2/2 11:47
 * Note:
 */
@RestController
public class TaskController {
    @Autowired
    TaskService taskService;

    @PriInfoToken
    @PostMapping("/updateTaskStatus")
    public JsonResult updateTaskStatus(@RequestBody Task task){
        if(taskService.findUserIn(task)
                .contains(TokenUtil.getTokenUserId()))
            taskService.updateStatus(task);
        return new JsonResult();
    }
}
