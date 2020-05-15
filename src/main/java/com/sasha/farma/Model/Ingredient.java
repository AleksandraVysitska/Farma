package com.sasha.farma.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document(collection = "ingredients")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ingredient {

    @MongoId
    private String id;

    private String name;

    @DBRef
    private List <Medicine> medicines;


}
