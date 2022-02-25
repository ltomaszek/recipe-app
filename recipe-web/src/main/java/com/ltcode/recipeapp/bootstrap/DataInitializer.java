package com.ltcode.recipeapp.bootstrap;

import com.ltcode.recipeapp.domain.Recipe;
import com.ltcode.recipeapp.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer implements CommandLineRunner {

    private RecipeRepository recipeRepository;

    public DataInitializer(@Qualifier("recipeRepositoryMap") RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Recipe r1 = new Recipe();
        r1.setDescription("Description of recipe 1");

        Recipe r2 = new Recipe();
        r2.setDescription("Description of recipe 2");

        recipeRepository.save(r1);
        recipeRepository.save(r2);

        System.out.printf("Loaded %d recipes to repository...\n", 2);
    }
}
