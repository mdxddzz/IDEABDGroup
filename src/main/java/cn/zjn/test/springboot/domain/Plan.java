package cn.zjn.test.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/2/1 11:55
 * Note:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Plan {
    private Integer PLANID;
    private String TITLE;
    private String DETAIL;
    private Integer TYPE;
    private String AUTHOR;
    private String REMARKS;
}
