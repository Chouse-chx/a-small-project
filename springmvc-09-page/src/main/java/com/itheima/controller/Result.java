package com.itheima.controller;

public class Result {
    private Object data;
    private Integer Code;
    private String msg;

    public Result() {
    }

    //一般状态码放前面
    public Result( Integer code,Object data) {
        this.data = data;
        Code = code;
    }

    public Result(Integer code,Object data,  String msg) {
        this.data = data;
        Code = code;
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer code) {
        Code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
