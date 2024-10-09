package com.store.demo_store.dto;

import lombok.*;

@Data
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RequestProduct {
    private String id;
    private String name;
    private String description;
    private double price;
}
