package com.dbms.boot.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;

public class Form {

    // with default value
    private String minYear = "2012";
    private String maxYear = "2020";
    private String manufacturer = "ford";
    private String model = "camry";
    private String maxPrice = "30000";
//    private String minPrice = "10000";
    private String maxMileage = "50000";
    private String fuelType="gas";
    private String numOfCylinders = "6 cylinders";
    private String size = "full-size";
    private String state = "fl";
    private String region = "treasure coast";
    private String condition = "excellent";
    private String titleStatus ="clean";
    private String typeOfVehicle = "sedan";
    private String transmissionType = "automatic";
    private String typeOfDrive = "4wd";
    private String color = "white";


    public Form() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMinYear() {
        return minYear;
    }

    public void setMinYear(String minYear) {
        this.minYear = minYear;
    }

    public String getMaxYear() {
        return maxYear;
    }

    public void setMaxYear(String maxYear) {
        this.maxYear = maxYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getMaxMileage() {
        return maxMileage;
    }

    public void setMaxMileage(String maxMileage) {
        this.maxMileage = maxMileage;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getNumOfCylinders() {
        return numOfCylinders;
    }

    public void setNumOfCylinders(String numOfCylinders) {
        this.numOfCylinders = numOfCylinders;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getTitleStatus() {
        return titleStatus;
    }

    public void setTitleStatus(String titleStatus) {
        this.titleStatus = titleStatus;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getTypeOfDrive() {
        return typeOfDrive;
    }

    public void setTypeOfDrive(String typeOfDrive) {
        this.typeOfDrive = typeOfDrive;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
