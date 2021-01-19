package com.saischool.addressbookapp.model;

import com.saischool.addressbookapp.dto.AddressBookDTO;

public class AddressBookData {
    private int pId;
    private String firstName;
    private String lastName;
    private String address;

    public AddressBookData (){}

    public AddressBookData(int pId, AddressBookDTO addressBookDTO) {
        this.pId = pId;
        this.firstName=addressBookDTO.firstName;
        this.lastName=addressBookDTO.lastName;
        this.address=addressBookDTO.address;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
