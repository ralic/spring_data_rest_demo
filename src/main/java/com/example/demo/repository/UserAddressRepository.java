package com.example.demo.repository;

import com.example.demo.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAddressRepository extends JpaRepository<UserAddress,Integer> {
}
