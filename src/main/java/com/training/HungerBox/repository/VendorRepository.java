package com.training.HungerBox.repository;

import com.training.HungerBox.model.vendor.VendorDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VendorRepository extends JpaRepository<VendorDetails , Integer> {

    List<VendorDetails> findAll();

}
