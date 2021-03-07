package cn.zjn.test.springboot.dao;

import cn.zjn.test.springboot.domain.Page;
import cn.zjn.test.springboot.domain.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/1/31 14:56
 * Note:
 */
@Repository
@Mapper
public interface HResourcesMapper {
    List<Map<String,Object>> getTask(@Param("page") Page page);

    List<Map<String,Object>> getLast(@Param("page") Page page);
}
