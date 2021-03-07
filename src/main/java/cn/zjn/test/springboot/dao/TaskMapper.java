package cn.zjn.test.springboot.dao;

import cn.zjn.test.springboot.domain.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/2/2 11:48
 * Note:
 */
@Mapper
@Repository
public interface TaskMapper {
    ArrayList<String> findUserIn(@Param("task") Task task);

    void updateStatus(@Param("task") Task task);
}
