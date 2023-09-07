package com.alejopp.springbootdocker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alejopp.springbootdocker.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
