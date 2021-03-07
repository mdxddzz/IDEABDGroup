package cn.zjn.test.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Zjn ; Bring it on !!!
 * @Date: 2021/1/4 0004 20:15
 * Note:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer USERID;
    private String USERNAME;
    private String PASSWORD;
    private String EMAIL;
    private String IMAGEURL;
}
