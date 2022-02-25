package com.ltcode.recipeapp.repositories;

import com.ltcode.recipeapp.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
