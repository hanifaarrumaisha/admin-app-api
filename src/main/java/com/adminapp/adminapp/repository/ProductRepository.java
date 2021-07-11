package com.adminapp.adminapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adminapp.adminapp.model.Product;
import com.adminapp.adminapp.model.Role;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
