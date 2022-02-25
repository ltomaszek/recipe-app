package com.ltcode.recipeapp.repositories.db;

import com.ltcode.recipeapp.domain.Recipe;
import com.ltcode.recipeapp.repositories.RecipeRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;

@Primary
public interface RecipeRepositoryDb extends RecipeRepository, JpaRepository<Recipe, Long> {
}
