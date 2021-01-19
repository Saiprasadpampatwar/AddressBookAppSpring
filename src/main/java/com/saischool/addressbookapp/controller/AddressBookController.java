package com.saischool.addressbookapp.controller;

import com.saischool.addressbookapp.dto.AddressBookDTO;
import com.saischool.addressbookapp.dto.ResponseDTO;
import com.saischool.addressbookapp.model.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @RequestMapping(value = { "", "/", "/get" })
    public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1,new AddressBookDTO("Pankaj","Tripathi","Mirzapur"));
        ResponseDTO respDTO = new ResponseDTO("Get Call SuccessFul",addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{pId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("pId") int pId) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1,new AddressBookDTO("Pankaj","Tripathi","Mirzapur"));
        ResponseDTO respDTO = new ResponseDTO("Get Call SuccessFul for id: "+pId,addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createEmployeePayrollData( @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Created addressbook data SuccessFul: ",addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PutMapping("update/{pId}")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("pId") int pId,
                                                            @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(pId, addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated addressbook data SuccessFul for Id: "+pId,addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{pId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("pId") int pId) {
        ResponseDTO respDTO = new ResponseDTO("Deleted Successfully"," deleted id: "+pId);
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }
}
