package com.sasha.farma.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "companies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    @Id
    private String id;

    private String name;
    private String adress;

    @DBRef
    private List <Medicine> medicines;

}
