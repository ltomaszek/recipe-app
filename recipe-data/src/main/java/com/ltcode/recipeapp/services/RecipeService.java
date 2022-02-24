package com.ltcode.recipeapp.services;

import com.ltcode.recipeapp.domain.Recipe;
import com.ltcode.recipeapp.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    private RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Recipe save(Recipe entity) {
        return recipeRepository.save(entity);
    }

    public Recipe findById(Long id) {
        var optionalRecipe = recipeRepository.findById(id);
        return optionalRecipe.isPresent()
                ? optionalRecipe.get()
                : null;
    }

    public  List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    public long count() {
        return recipeRepository.count();
    }
}
