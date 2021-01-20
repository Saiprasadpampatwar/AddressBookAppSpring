package com.saischool.addressbookapp.dto;

import javax.validation.constraints.Pattern;

public class AddressBookDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message = "Person Name Invalid")
    public String firstName;

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message = "Person Name Invalid")
    public String lastName;

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message = "Person Name Invalid")
    public String address;

    public AddressBookDTO(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
