package com.projeto.course.repositories;

import com.projeto.course.entities.Category;
import com.projeto.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {
}
