package cn.zjn.test.springboot.controller;

import cn.zjn.test.springboot.service.MResourcesService;
import cn.zjn.test.springboot.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/2/1 16:16
 * Note:成员页资源
 */
@RestController
public class MResourcesController {
    @Autowired
    MResourcesService mResourcesService;

    @GetMapping("/getUsers")
    public JsonResult getUsers() {
        Collections.emptyList().add(mResourcesService.getUsers());
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(mResourcesService.getUsers());
        objects.add(mResourcesService.getUserId());
        return new JsonResult(objects);
    }
}
