package com.boil.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @Description     自定义响应数据结构
 *                  本类可提供给 H5/iso/安卓/公众号/小程序使用
 *                  前端接收此类数据(json object)后，可自行根据业务区实现相关功能
 *
 *                  200: 表示成功
 *                  500: 表示错误，错误信息在msg字段中
 *                  501: bean验证错误，不管多少个错误都以map形式返回
 *                  502: 拦截器拦截到用户token出错
 *                  555: 异常抛出信息
 *                  556: 用户qq校验异常
 * @author lifuxiang
 * @date 2020/10/30 10:22
 */
public class BoilJSONResult {
    /**
     * 定义jackson对象
     */
    private static final ObjectMapper MAPPER = new ObjectMapper();
    /**
     * 响应业务状态
     */
    private Integer status;
    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应中的数据
     */
    private Object data;

    @JsonIgnore
    private String ok;

    /**
     * 构造器，使用多态构建
     */

    public BoilJSONResult() {
    }

    public BoilJSONResult(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public BoilJSONResult(Integer status, String message, Object data, String ok) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.ok = ok;
    }

    public BoilJSONResult(Object data) {
        this.data = data;
        this.status = 200;
        this.message = "ok";
    }


    public static BoilJSONResult build(Integer status, String message, Object data) {
        return build(status,message,data,null);
    }

    public static BoilJSONResult build(Integer status, String message, Object data,String ok) {
        return new BoilJSONResult(status,message,data,ok);
    }

    /**
     *  错误相关的反馈信息
     */
    public static BoilJSONResult errorMsg(String message) {
        return new BoilJSONResult(500,message,null);
    }

    public static BoilJSONResult errorMap(Object data) {
        return new BoilJSONResult(501,"error",data);
    }

    public static BoilJSONResult errorTokenMessage(String message) {
        return new BoilJSONResult(502,message,null);
    }

    public static BoilJSONResult errorException(String message) {
        return new BoilJSONResult(555,message,null);
    }

    public static BoilJSONResult errorUserQQ(String message) {
        return new BoilJSONResult(556,message,null);
    }

    /**
     *  成功的反馈信息
     */

    public static BoilJSONResult ok() {
        return new BoilJSONResult(null);
    }

    public static BoilJSONResult ok(Object data) {
        return new BoilJSONResult(data);
    }


    /**
     *  set与get方法
     */



    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }
}
