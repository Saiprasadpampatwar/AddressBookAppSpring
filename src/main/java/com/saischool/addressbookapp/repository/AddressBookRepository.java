package com.saischool.addressbookapp.repository;

import com.saischool.addressbookapp.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {
}
