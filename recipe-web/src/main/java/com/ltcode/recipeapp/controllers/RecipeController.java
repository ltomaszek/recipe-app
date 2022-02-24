package com.ltcode.recipeapp.controllers;

import com.ltcode.recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipeController {

    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("list")
    public String getListOfRecipes(Model model) {
        model.addAttribute("listOfRecipes", recipeService.findAll());
        return "views/listOfRecipes";
    }
}
