package com.projeto.course.repositories;

import com.projeto.course.entities.Category;
import com.projeto.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Long> {
}
