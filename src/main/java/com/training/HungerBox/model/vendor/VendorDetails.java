package com.training.HungerBox.model.vendor;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "vendors")
public class VendorDetails {

    @Id
    @Column(name = "id")
    @JsonProperty("vendorId")
    String vendorId;

    @Column(name = "vendor_name")
    @JsonProperty("vendorName")
    String vendorName;

    @Column(name = "active_flag")
    @JsonProperty("active")
    Boolean activeFlag;




}
