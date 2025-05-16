package ru.bsuedu.cad.lab.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ru.bsuedu.cad.lab.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    
}