package com.saischool.addressbookapp.services;

import com.saischool.addressbookapp.dto.AddressBookDTO;
import com.saischool.addressbookapp.exceptions.AddressBookException;
import com.saischool.addressbookapp.model.AddressBookData;
import com.saischool.addressbookapp.repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {

    @Autowired
    private AddressBookRepository addressBookRepository;

    private List<AddressBookData> addressBookDataList = new ArrayList<>();


    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookRepository.findAll();
    }

    @Override
    public AddressBookData getAddressBookDataById(int pId) {
        return addressBookRepository
                .findById(pId)
                .orElseThrow(() -> new AddressBookException("Person with Id "+pId+" does not exist"));
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(addressBookDTO);
        log.debug("AddressBook Data: "+addressBookData.toString());
        addressBookDataList.add(addressBookData);
        return addressBookRepository.save(addressBookData);
    }

    @Override
    public AddressBookData updateAddressBookData(int pId, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.getAddressBookDataById(pId);
        addressBookData.updateAddressBookData(addressBookDTO);

        return addressBookRepository.save(addressBookData);
    }

    @Override
    public void deleteAddressBookDataById(int pId) {
        AddressBookData addressBookData = this.getAddressBookDataById(pId);
        addressBookRepository.delete(addressBookData);
    }
}
