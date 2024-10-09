package com.store.demo_store.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductResponse {
    private String id;
    private String name;
    private String description;
    private double price;
}
