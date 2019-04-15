package com.shafiul.alam.recipeproject.repositories;

import com.shafiul.alam.recipeproject.model.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

    Optional<Recipe> findByDescription(String description);
}
