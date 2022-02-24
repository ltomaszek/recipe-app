package com.ltcode.recipeapp.repositories.map;

import com.ltcode.recipeapp.domain.Recipe;
import com.ltcode.recipeapp.repositories.RecipeRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class RecipeRepositoryMap implements RecipeRepository {

    private Map<Long, Recipe> map = new HashMap<>();
    private long currentMaxId = 0L;

    @Override
    public Recipe save(Recipe entity) {
        Long id = entity.getId();
        if (id == null) {
            id = getAndUpdateNextId();
            entity.setId(id);
        }
        map.put(id, entity);
        return entity;
    }

    @Override
    public Optional<Recipe> findById(Long id) {
        return Optional.ofNullable(map.get(id));
    }

    @Override
    public List<Recipe> findAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public long count() {
        return map.size();
    }

    // == PRIVATE HELPER METHODS ==

    private long getAndUpdateNextId() {
        currentMaxId++;
        return currentMaxId;
    }
}
