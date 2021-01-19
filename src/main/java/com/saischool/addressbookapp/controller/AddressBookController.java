package com.saischool.addressbookapp.controller;

import com.saischool.addressbookapp.dto.AddressBookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @RequestMapping(value = { "", "/", "/get" })
    public ResponseEntity<String> getEmployeePayrollData() {
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }

    @GetMapping("/get/{pId}")
    public ResponseEntity<String> getEmployeePayrollData(@PathVariable("pId") int pId) {
        return new ResponseEntity<String>("Get Call Success "+ pId , HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createEmployeePayrollData( @RequestBody AddressBookDTO addressBookDTODTO) {
        return new ResponseEntity<String>("created AddressBook data for: "+addressBookDTODTO, HttpStatus.OK);
    }

    @PutMapping("update/{pId}")
    public ResponseEntity<String> updateEmployeePayrollData(@PathVariable("pId") int pId,
                                                            @RequestBody AddressBookDTO addressBookDTO) {
        return new ResponseEntity<String>("Updated AddressBook data for: "+addressBookDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{pId}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("pId") int pId) {
        return new ResponseEntity<String>("delete call success for id: "+pId, HttpStatus.OK);
    }
}
