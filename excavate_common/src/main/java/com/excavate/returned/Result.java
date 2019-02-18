package com.excavate.returned;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author misterWei
 * @create 2019年02月16号:22点28分
 * @mailbox mynameisweiyan@gmail.com
 * 这是一个对前端约定好的一个参数类信息
 */
public class Result<T> implements Serializable{
    private Boolean flag;
    private String message;
    private List<T> parameterList  = new ArrayList<>();
    private Map  parmenterMap = new HashMap();

    public Result(Boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public Result(Boolean flag, String message, List<T> parameterList) {
        this.flag = flag;
        this.message = message;
        this.parameterList = parameterList;
    }

    public Result(Boolean flag, String message, List<T> parameterList, Map parmenterMap) {
        this.flag = flag;
        this.message = message;
        this.parameterList = parameterList;
        this.parmenterMap = parmenterMap;
    }

    public Result() {
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getParameterList() {
        return parameterList;
    }

    public void setParameterList(List<T> parameterList) {
        this.parameterList = parameterList;
    }

    public Map getParmenterMap() {
        return parmenterMap;
    }

    public void setParmenterMap(Map parmenterMap) {
        this.parmenterMap = parmenterMap;
    }
    public void addParmenterMap(String key,Object value){
        this.parmenterMap.put(key,value);
    }
}
