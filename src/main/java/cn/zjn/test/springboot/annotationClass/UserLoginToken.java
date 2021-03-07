package cn.zjn.test.springboot.annotationClass;

import java.lang.annotation.*;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/1/30 23:04
 * Note:
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UserLoginToken {
    boolean required() default true;
}
