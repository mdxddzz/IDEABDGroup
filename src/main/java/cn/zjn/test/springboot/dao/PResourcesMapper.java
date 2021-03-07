package cn.zjn.test.springboot.dao;

import cn.zjn.test.springboot.domain.Page;
import cn.zjn.test.springboot.domain.Plan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/2/1 11:52
 * Note:
 */
@Mapper
@Repository
public interface PResourcesMapper {
    List<Map> getPlan(@Param("name") String name, @Param("page") Page page);

    void addPlan(Plan plan);
}
