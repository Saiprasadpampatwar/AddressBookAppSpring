package com.saischool.addressbookapp.services;

import com.saischool.addressbookapp.dto.AddressBookDTO;
import com.saischool.addressbookapp.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressBookDataById(int pId);

    AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

    AddressBookData updateAddressBookData(int pId, AddressBookDTO addressBookDTO);

    void deleteAddressBookDataById(int pId);
}
