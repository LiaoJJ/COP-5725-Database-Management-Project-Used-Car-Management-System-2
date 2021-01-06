package com.dbms.boot.entities;

public class QueryPara {
    private String modelName;
    private Integer minYear;
    private Integer maxYear;
    private String condition;
    private String status;
    private String fuel;
    private String manufacturer;
    private String state;
    private String region;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getMinYear() {
        return minYear;
    }

    public void setMinYear(Integer minYear) {
        this.minYear = minYear;
    }

    public Integer getMaxYear() {
        return maxYear;
    }

    public void setMaxYear(Integer maxYear) {
        this.maxYear = maxYear;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer() {
        this.manufacturer = manufacturer;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
