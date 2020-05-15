package com.sasha.farma.DAO;

import com.sasha.farma.Model.Ingredient;
import com.sasha.farma.Model.Medicine;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientRepository extends MongoRepository <Ingredient, String> {
    Ingredient findByName (String name);
    List<Medicine> findByMedicines(String name);
}
