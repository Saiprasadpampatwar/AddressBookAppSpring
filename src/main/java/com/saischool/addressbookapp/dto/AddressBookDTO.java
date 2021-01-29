package com.saischool.addressbookapp.dto;

import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public @ToString class AddressBookDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message = "Person name Invalid")
    public String name;

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message = "Person Address Invalid")
    public String address;

    @NotBlank(message = "City cannot be Empty")
    public String city;

    @NotBlank(message = "State Can not be Emplty")
    public String state;

    @Pattern(regexp = "[0-9]{6}",message = "Zip Not Valid")
    public String zip;

    @Pattern(regexp = "[0-9]{10}",message = "mobile Not Valid")
    public String mobile;

    public int pId;



}
