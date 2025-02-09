package com.projeto.course.repositories;

import com.projeto.course.entities.OrderItem;
import com.projeto.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {
}
