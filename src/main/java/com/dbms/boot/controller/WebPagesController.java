package com.dbms.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.dbms.boot.repository.*;
import org.springframework.ui.Model;

@Controller
public class WebPagesController {
    @Autowired
    ListingRepository listingRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ModelRepository modelRepository;
    @Autowired
    VehicleRepository vehicleRepository;
    @Autowired
    LocationRepository locationRepository;
    @Autowired
    ReviewRepository reviewRepository;

    @GetMapping("/home")
    public String homepage() {
        return "homepage";
    }

    @GetMapping("/showamount")
    public String showAmount(Model model) {
        String cntListing = "Table Listing: " + listingRepository.countListing().toString();
        String cntUsers = "Table Users: " + userRepository.countUsers().toString();
        String cntModel = "Table Model: " + modelRepository.countModel().toString();
        String cntVehicle = "Table Vehicle: " + vehicleRepository.countVehicle().toString();
        String cntLocation = "Table Location: " + locationRepository.countLocation().toString();
        int total = listingRepository.countListing().intValue() + userRepository.countUsers().intValue() + modelRepository.countModel().intValue() + vehicleRepository.countVehicle().intValue() + locationRepository.countLocation().intValue();
        String cntTotal = "Total data amount: " + Integer.toString(total);
        model.addAttribute("cntListing", cntListing);
        model.addAttribute("cntUsers", cntUsers);
        model.addAttribute("cntModel", cntModel);
        model.addAttribute("cntVehicle", cntVehicle);
        model.addAttribute("cntLocation", cntLocation);
        model.addAttribute("cntTotal", cntTotal);
        return "amountPage";
    }

}
