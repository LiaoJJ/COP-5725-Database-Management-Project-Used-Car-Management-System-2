package com.dbms.boot.entities;

public class SearchPara {
    private Integer minYear;
    private Integer maxYear;
    private String manufacturer;
    private String modelName;
    private Integer minPrice;
    private Integer maxPrice;
    private Integer minOdo;
    private Integer maxOdo;
    private String state;
    private String status;
    private String color;

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
}
