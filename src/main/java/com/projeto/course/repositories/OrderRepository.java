package com.projeto.course.repositories;

import com.projeto.course.entities.Order;
import com.projeto.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long> {
}
