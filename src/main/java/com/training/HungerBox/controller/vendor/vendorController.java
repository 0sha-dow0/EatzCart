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



    @GetMapping(path = "/all_Vendors")
    @ResponseBody
    public List<VendorDetails> vendor() {
        System.out.println("hrere");
       return vendorService.getAllVendorDetails();
    }

    @PostMapping(path = "/add_vendor")
    @ResponseBody
    public String addVendor(@RequestBody VendorDetails vendorDetails) {
        return vendorService.addVendorDetails(vendorDetails);
    }

    @GetMapping(path = "/vendor_status/{status}")
    @ResponseBody
    public List<VendorDetails> getAllActiveVendors(@PathVariable String status) {
        return vendorService.getAllActiveVendorDetails(status);
    }

    @GetMapping(path = "/vendor_approval_status/{vendorId}")
    @ResponseBody
    public String getAllActiveVendors(@PathVariable Integer vendorId) {
        return vendorService.verifyVendor(vendorId);
    }

}
