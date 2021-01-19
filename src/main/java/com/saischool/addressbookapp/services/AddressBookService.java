package com.saischool.addressbookapp.services;

import com.saischool.addressbookapp.dto.AddressBookDTO;
import com.saischool.addressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    private List<AddressBookData> addressBookDataList = new ArrayList<>();


    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int pId) {
        AddressBookData addressBookData = null;
        addressBookData = addressBookDataList.get(pId-1);
        return addressBookData;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(addressBookDataList.size()+1,addressBookDTO);
        addressBookDataList.add(addressBookData);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(int pId, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.getAddressBookDataById(pId);
        addressBookData.setFirstName(addressBookDTO.firstName);
        addressBookData.setLastName(addressBookDTO.lastName);
        addressBookData.setAddress(addressBookDTO.address);
        addressBookDataList.set(pId-1,addressBookData);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookDataById(int pId) {
        addressBookDataList.remove(pId-1);
    }
}
