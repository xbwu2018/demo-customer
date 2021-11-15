package com.example.demo;

import lombok.Data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * @author XIAOBING
 */

@Entity
@Data

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    
    public Customer() {}

    Customer(String name, String email) {

      this.name = name;
      this.email = email;
    }

    public Long getId() {
      return this.id;
    }

    public String getName() {
      return this.name;
    }

    public String getEmail() {
      return this.email;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public void setName(String name) {
      this.name = name;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    @Override
    public boolean equals(Object o) {

      if (this == o)
        return true;
      if (!(o instanceof Customer))
        return false;
      Customer customer = (Customer) o;
      return Objects.equals(this.id, customer.id) && Objects.equals(this.name, customer.name)
          && Objects.equals(this.email, customer.email);
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.id, this.name, this.email);
    }

    @Override
    public String toString() {
      return "Customer{" + "id=" + this.id + ", name='" + this.name + '\'' + ", email='" + this.email + '\'' + '}';
    }
}
    
