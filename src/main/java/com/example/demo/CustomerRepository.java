package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * @author XIAOBING
 */
@Repository

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}