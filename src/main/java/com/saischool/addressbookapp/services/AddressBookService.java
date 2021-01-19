package com.saischool.addressbookapp.services;

import com.saischool.addressbookapp.dto.AddressBookDTO;
import com.saischool.addressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> addressBookDataList = new ArrayList<>();
        addressBookDataList.add(new AddressBookData(1,new AddressBookDTO("Pankaj","Tripathi","Mirzapur")));
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById() {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1,new AddressBookDTO("Pankaj","Tripathi","Mirzapur"));
        return addressBookData;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1,addressBookDTO);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(int pId, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(pId,addressBookDTO);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookDataById(int pId) {

    }
}
