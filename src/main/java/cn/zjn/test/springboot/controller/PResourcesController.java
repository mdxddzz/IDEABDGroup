package cn.zjn.test.springboot.controller;

import cn.zjn.test.springboot.domain.Page;
import cn.zjn.test.springboot.domain.Plan;
import cn.zjn.test.springboot.annotationClass.PriInfoToken;
import cn.zjn.test.springboot.service.PResourcesService;
import cn.zjn.test.springboot.utils.JsonResult;
import cn.zjn.test.springboot.utils.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/2/1 13:06
 * Note:计划页资源
 */
@RestController
public class PResourcesController {
    @Autowired
    PResourcesService pResourcesService;

    @PriInfoToken
    @GetMapping("/getPlan")
    public JsonResult getPlan(@RequestParam Integer amount, @RequestParam(defaultValue = "5") Integer limit){
        return new JsonResult(pResourcesService.getPlan(TokenUtil.getTokenUserId(),new Page(amount,limit)));
    }


    @PriInfoToken
    @PostMapping("/addPlan")
    public JsonResult addPlan(@RequestBody Plan plan){
        plan.setAUTHOR(TokenUtil.getTokenUserId());
        pResourcesService.addPlan(plan);
        return new JsonResult();
    }
}
