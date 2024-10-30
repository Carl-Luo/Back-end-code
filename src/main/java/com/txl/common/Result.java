package com.txl.common;

public class Result {

    private  static final String SUCESS = "0";
    private  static final String ERROR = "1";
    private  String code;
    private String msg;
    private Object data;

    public static Result sucess(){
        Result result = new Result();
        result.setCode(SUCESS);
        return result;
    }

    public static Result sucess(Object data){
        Result result = new Result();
        result.setCode(SUCESS);
        result.setData(data);
        return result;
    }

    public static Result error(String msg){
        Result result = new Result();
        result.setCode(ERROR);
        result.setMsg(msg);
        return result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
