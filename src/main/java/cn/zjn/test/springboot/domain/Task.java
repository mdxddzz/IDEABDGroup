package cn.zjn.test.springboot.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/1/31 14:58
 * Note:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    private Integer TASKID;
    private String TITLE;
    private String DETAIL;
    private String MEMBERS;
    private Integer CLICKNUM;
    private String STATUS;
    private Integer SINGLE;
    private String REMARKS;
}
