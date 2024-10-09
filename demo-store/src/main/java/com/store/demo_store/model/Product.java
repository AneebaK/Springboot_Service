package com.store.demo_store.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(value = "Product")
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
}
