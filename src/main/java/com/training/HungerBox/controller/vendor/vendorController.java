package com.training.HungerBox.controller.vendor;


import com.training.HungerBox.model.vendor.VendorDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.training.HungerBox.service.VendorService;

import java.util.List;

@RestController
public class vendorController {

    @Autowired
    VendorService vendorService;

    @GetMapping(path = "/health")
    public String health() {
        return "OK";
    }



    @GetMapping(path = "/allVendors")
    @ResponseBody
    public List<VendorDetails> vendor() {
        System.out.println("hrere");
       return vendorService.getAllVendorDetails();
    }


}
