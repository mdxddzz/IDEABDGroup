package cn.zjn.test.springboot.controller;

import cn.zjn.test.springboot.domain.Page;
import cn.zjn.test.springboot.service.HResourcesService;
import cn.zjn.test.springboot.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/1/31 14:50
 * Note:首页资源
 */
@RestController
public class HResourcesController {
    @Autowired
    HResourcesService resourcesService;

    @GetMapping("/getTask")         //首页展示项目进度
    public JsonResult getTask(@RequestParam Integer amount,@RequestParam(defaultValue = "5") Integer limit){

        return new JsonResult(resourcesService.getTask(new Page(amount,limit)));
    }

    @GetMapping("/getLast")
    public JsonResult getLast(@RequestParam Integer amount,@RequestParam(defaultValue = "5") Integer limit){
        return new JsonResult(resourcesService.getLast(new Page(amount,limit)));
    }
}
