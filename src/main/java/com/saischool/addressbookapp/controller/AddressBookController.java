package com.saischool.addressbookapp.controller;

import com.saischool.addressbookapp.dto.AddressBookDTO;
import com.saischool.addressbookapp.dto.ResponseDTO;
import com.saischool.addressbookapp.model.AddressBookData;
import com.saischool.addressbookapp.services.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;

    @RequestMapping(value = { "", "/", "/get" })
    public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
        List<AddressBookData> addressBookDataList = null;
        addressBookDataList = addressBookService.getAddressBookData();
        ResponseDTO respDTO = new ResponseDTO("Get Call SuccessFul",addressBookDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{pId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("pId") int pId) {
        AddressBookData addressBookData = null;
        addressBookData = addressBookService.getAddressBookDataById(pId);
        ResponseDTO respDTO = new ResponseDTO("Get Call SuccessFul for id: "+pId,addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createEmployeePayrollData(@Valid @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = addressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Created addressbook data SuccessFul: ",addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PutMapping("update/{pId}")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("pId") int pId,
                                                           @Valid @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = addressBookService.updateAddressBookData(pId,addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated addressbook data SuccessFul for Id: "+pId,addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{pId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("pId") int pId) {
        addressBookService.deleteAddressBookDataById(pId);
        ResponseDTO respDTO = new ResponseDTO("Deleted Successfully"," deleted id: "+pId);
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }
}
