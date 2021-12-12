package com.HCInteraction.Backend.Json.BodyAttr;

import java.util.List;

@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
public class BodyAttrJson {
    private int person_num;
    private List<PersonInfo> person_info;
    private long log_id;

    public BodyAttrJson(int person_num, List<PersonInfo> person_info, long log_id) {
        this.person_num = person_num;
        this.person_info = person_info;
        this.log_id = log_id;
    }

    public int getPerson_num() {
        return person_num;
    }

    public void setPerson_num(int person_num) {
        this.person_num = person_num;
    }

    public List<PersonInfo> getPerson_info() {
        return person_info;
    }

    public void setPerson_info(List<PersonInfo> person_info) {
        this.person_info = person_info;
    }

    public long getLog_id() {
        return log_id;
    }

    public void setLog_id(long log_id) {
        this.log_id = log_id;
    }
}
