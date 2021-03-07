package cn.zjn.test.springboot.utils;

import lombok.Data;

/**
 * @Author: Zjn ; Bring it on !!!
 * @Date: 2021/1/4 0004 20:16
 * Note:
 */
@Data
public class JsonResult<T> {

    private T data;
    private String code;
    private String msg;

    /**
     * 若没有数据返回，默认状态码为 200，提示信息为“操作成功！”
     */
    public JsonResult() {
        this.code = "200";
        this.msg = "0";
    }

    /**
     * 若没有数据返回，可以人为指定状态码和提示信息
     * @param code
     * @param msg
     */
    public JsonResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 有数据返回时，状态码为 200，默认提示信息为“操作成功！”
     * @param data
     */
    public JsonResult(T data) {
        this.data = data;
        this.code = "200";
        this.msg = "0";
    }

    /**
     * 有数据返回，状态码为 200，人为指定提示信息
     * @param data
     * @param msg
     */
    public JsonResult(T data, String msg) {
        this.data = data;
        this.code = "200";
        this.msg = msg;
    }

    public JsonResult(T data, String code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }
}