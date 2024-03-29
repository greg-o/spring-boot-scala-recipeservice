// Recipe Service
// Created by: Greg Osgood
// Copyright: none

package org.grego.recipeservice.repository

import org.grego.recipeservice.model.Recipe
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.util.Streamable
trait RecipeRepository extends PagingAndSortingRepository[Recipe, Long] {
  def findAllByName(name: String): Streamable[Recipe]
}
