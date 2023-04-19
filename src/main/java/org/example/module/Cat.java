package org.example.module;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cat {
    @Id
    private int id;
    private String moniker;
    private String color;

    private int age;
}
