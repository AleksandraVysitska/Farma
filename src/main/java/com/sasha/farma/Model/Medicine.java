package com.sasha.farma.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "medicines")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Medicine {

    @Id
    private String id;
    private String name;
    private Company company;

    @DBRef
    private List <Ingredient> ingredients;

}
