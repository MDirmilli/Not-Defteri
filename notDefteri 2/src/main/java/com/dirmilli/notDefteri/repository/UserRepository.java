package com.dirmilli.notDefteri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dirmilli.notDefteri.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {



}
