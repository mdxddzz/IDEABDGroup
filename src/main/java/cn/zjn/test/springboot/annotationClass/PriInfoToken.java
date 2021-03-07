package cn.zjn.test.springboot.annotationClass;

import java.lang.annotation.*;

/**
 * @Author: Zjn *Bring it on!!!*
 * @Date: 2021/2/1 13:23
 * Note:
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PriInfoToken {
    boolean required() default true;
}
