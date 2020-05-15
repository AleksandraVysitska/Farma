package com.sasha.farma.DAO;

import com.sasha.farma.Model.Company;
import com.sasha.farma.Model.Ingredient;
import com.sasha.farma.Model.Medicine;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicineRepository extends MongoRepository <Medicine, String> {

    Medicine findByName (String name);
    List<Company> findByCompany (String companyName);
    List<Ingredient> findByIngredients (String ingredientName);

}
