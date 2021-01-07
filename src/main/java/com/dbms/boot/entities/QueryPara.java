package com.dbms.boot.entities;

import com.dbms.boot.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueryPara {

    private String modelName;
    private Integer minYear = 2000;
    private Integer maxYear = 2020;
    private String condition;
    private String status;
    private String fuel;
    private String manufacturer = "Toyota";
    private String state;
    private String region;

    private List<String> manufacturerList = new ArrayList<>();
    private List<String> stateList = new ArrayList<>();
    private List<String> regionList = new ArrayList<>();
    private List<String> conditionList = new ArrayList<>();
    private List<String> statusList = new ArrayList<>();
    private List<String> fuelList = new ArrayList<>();


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

    public List<String> getManufacturerList() {
        return manufacturerList;
    }

    public void setManufacturerList(List<String> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }

    public List<String> getStateList() {
        return stateList;
    }

    public void setStateList(List<String> stateList) {
        this.stateList = stateList;
    }

    public List<String> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<String> regionList) {
        this.regionList = regionList;
    }

    public List<String> getConditionList() {
        return conditionList;
    }

    public void setConditionList(List<String> conditionList) {
        this.conditionList = conditionList;
    }

    public List<String> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<String> statusList) {
        this.statusList = statusList;
    }

    public List<String> getFuelList() {
        return fuelList;
    }

    public void setFuelList(List<String> fuelList) {
        this.fuelList = fuelList;
    }
}
