package com.saischool.addressbookapp.model;

import com.saischool.addressbookapp.dto.AddressBookDTO;
import lombok.Data;


import javax.persistence.*;

@Entity
@Table(name = "address_book")
public @Data class AddressBookData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    private int pId;

    @Column(name = "name")
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String mobile;

    public AddressBookData(){}

    public AddressBookData(AddressBookDTO addressBookDTO) {
        this.name=addressBookDTO.name;
        this.address=addressBookDTO.address;
        this.city = addressBookDTO.city;
        this.state = addressBookDTO.state;
        this.zip = addressBookDTO.zip;
        this.mobile = addressBookDTO.mobile;
    }

    public void updateAddressBookData(AddressBookDTO addressBookDTO) {
        this.name=addressBookDTO.name;
        this.address=addressBookDTO.address;
        this.city = addressBookDTO.city;
        this.state = addressBookDTO.state;
        this.zip = addressBookDTO.zip;
        this.mobile = addressBookDTO.mobile;
    }
}
