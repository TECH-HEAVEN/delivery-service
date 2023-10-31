package com.icebear2n2.deliveryservice.domain.repository;

import com.icebear2n2.deliveryservice.domain.entity.user.User;

import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {


}