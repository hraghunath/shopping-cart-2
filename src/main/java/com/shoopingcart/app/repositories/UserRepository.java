package com.shoopingcart.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoopingcart.app.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
