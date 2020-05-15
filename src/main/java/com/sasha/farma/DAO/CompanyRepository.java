package com.sasha.farma.DAO;

import com.sasha.farma.Model.Company;
import com.sasha.farma.Model.Medicine;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends MongoRepository <Company, String> {

    Company findByName (String name);
    List <Medicine> findByMedicines (String name);

}
