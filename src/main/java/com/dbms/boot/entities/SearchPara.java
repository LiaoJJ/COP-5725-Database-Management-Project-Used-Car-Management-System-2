package com.dbms.boot.entities;

import java.util.ArrayList;
import java.util.List;

public class SearchPara {
    private Integer minYear = 2000;
    private Integer maxYear = 2020;
    private String manufacturer = "Toyota";
    private String modelName;
    private Integer minPrice = 0;
    private Integer maxPrice = 50000;
    private Integer minOdo;
    private Integer maxOdo;
    private String state;
    private String status;
    private String color;

    private List<String> manufacturerList = new ArrayList<>();
    private List<String> stateList = new ArrayList<>();
    private List<String> statusList = new ArrayList<>();
    private List<String> colorList = new ArrayList<>();

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
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public Integer getMinPrice() {
        return minPrice;
    }
    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }
    public Integer getMaxPrice() {
        return maxPrice;
    }
    public void setMaxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
    }
    public Integer getMinOdo() {
        return minOdo;
    }
    public void setMinOdo(Integer minOdo) {
        this.minOdo = minOdo;
    }
    public Integer getMaxOdo() {
        return maxOdo;
    }
    public void setMaxOdo(Integer maxOdo) {
        this.maxOdo = maxOdo;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
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

    public List<String> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<String> statusList) {
        this.statusList = statusList;
    }

    public List<String> getColorList() {
        return colorList;
    }

    public void setColorList(List<String> colorList) {
        this.colorList = colorList;
    }
}
