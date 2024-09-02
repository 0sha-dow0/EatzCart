package com.training.HungerBox.service;

import com.training.HungerBox.model.vendor.VendorDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.training.HungerBox.repository.VendorRepository;

import java.util.List;

@Service
public class VendorService {



    @Autowired
    private VendorRepository vendorRepository;




    public List<VendorDetails> getAllVendorDetails() {
        return vendorRepository.findAll();
    }


    public String addVendorDetails(VendorDetails vendorDetails) {
//        vendorDetails.setVendorId(vendorDetails.getVendorId());
        System.out.println(vendorDetails.getVendorId());
//        vendorDetails.setVendorId(11);
        vendorDetails.setActiveFlag(false);
        vendorDetails.setStatus("REQUESTED");
        vendorRepository.save(vendorDetails);
        return ("Approval requested for "+vendorDetails.getVendorName());

    }

    public List<VendorDetails> getAllActiveVendorDetails(String status) {
        return vendorRepository.findAllByStatus(status);
    }

    public String verifyVendor(Integer vendorId) {
        VendorDetails vendorDetails = vendorRepository.findById(vendorId).get();
        if(vendorDetails.getActiveFlag() && vendorDetails.getStatus().equals("APPROVED")) {
            return "Vendor Approved";
        } else if (vendorDetails.getActiveFlag() == false && vendorDetails.getStatus().equals("REQUESTED")) {
            return "vendor awaiting approval";

        } else if (vendorDetails.getActiveFlag() == false && vendorDetails.getStatus().equals("CANCELLED")) {
            return "Vendor Cancelled";

        }else
            return "Vendor Not Available";
    }


}
