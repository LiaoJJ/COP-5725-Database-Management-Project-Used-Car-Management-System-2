package com.dbms.boot.service;

import com.dbms.boot.repository.LocationRepository;
import com.dbms.boot.repository.ModelRepository;
import com.dbms.boot.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListService {
    @Autowired
    LocationRepository locationRepository;

    @Autowired
    ModelRepository modelRepository;

    @Autowired
    VehicleRepository vehicleRepository;

    public List<String> regionList(){
        return locationRepository.regionList();
    }

    public List<String> stateList(){
        return locationRepository.stateList();
    }

    public List<String> manufacturerList(){
        return modelRepository.manufacturerList();
    }

    public List<String> fuelList(){
        return modelRepository.fuelList();
    }

    public List<String> statusList(){
        return vehicleRepository.statusList();
    }

    public List<String> conditionList(){
        return vehicleRepository.conditionList();
    }

    public List<String> colorList(){
        return vehicleRepository.colorList();
    }
}
