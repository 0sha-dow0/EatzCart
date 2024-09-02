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


}
