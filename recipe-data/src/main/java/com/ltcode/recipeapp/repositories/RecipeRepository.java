package com.ltcode.recipeapp.repositories;

import com.ltcode.recipeapp.domain.Recipe;

import java.util.List;
import java.util.Optional;

public interface RecipeRepository {

    Recipe save(Recipe entity);

    Optional<Recipe> findById(Long id);

    List<Recipe> findAll();

    long count();
}
