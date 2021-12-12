package com.HCInteraction.Backend.Json.Gesture;

import java.util.List;

@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
public class GestureJson {
    private int result_num;
    private long log_id;
    private List<Result> result;

    public GestureJson(int result_num, long log_id, List<Result> result) {
        this.result_num = result_num;
        this.log_id = log_id;
        this.result = result;
    }

    public int getResult_num() {
        return result_num;
    }

    public void setResult_num(int result_num) {
        this.result_num = result_num;
    }

    public long getLog_id() {
        return log_id;
    }

    public void setLog_id(long log_id) {
        this.log_id = log_id;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }
}
