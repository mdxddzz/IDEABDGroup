package cn.zjn.test.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/2/4 13:24
 * Note:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Page {
    private Integer AMOUNT;
    private Integer LIMIT;
}
