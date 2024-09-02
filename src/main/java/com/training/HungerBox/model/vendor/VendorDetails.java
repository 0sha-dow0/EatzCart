package com.training.HungerBox.model.vendor;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "vendors")
public class VendorDetails {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("vendorId")
    Integer vendorId;

    @Column(name = "vendor_name")
    @JsonProperty("vendorName")
    String vendorName;

    @Column(name = "active_flag")
    @JsonProperty("active")
    Boolean activeFlag;

    @Column(name = "status")
    @JsonProperty("status")
    String status;



}
