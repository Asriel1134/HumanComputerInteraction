package com.HCInteraction.Backend.Json.DriverBehavior;

import java.util.List;

@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
public class DriverBehaviorJson {
    private int person_num;
    private List<PersonInfo> person_info;
    private int driver_num;
    private long log_id;

    public DriverBehaviorJson(int person_num, List<PersonInfo> person_info, int driver_num, long log_id) {
        this.person_num = person_num;
        this.person_info = person_info;
        this.driver_num = driver_num;
        this.log_id = log_id;
    }

    public int getDriver_num() {
        return driver_num;
    }

    public void setDriver_num(int driver_num) {
        this.driver_num = driver_num;
    }

    public List<PersonInfo> getPerson_info() {
        return person_info;
    }

    public void setPerson_info(List<PersonInfo> person_info) {
        this.person_info = person_info;
    }

    public int getPerson_num() {
        return person_num;
    }

    public void setPerson_num(int person_num) {
        this.person_num = person_num;
    }

    public long getLog_id() {
        return log_id;
    }

    public void setLog_id(long log_id) {
        this.log_id = log_id;
    }
}
