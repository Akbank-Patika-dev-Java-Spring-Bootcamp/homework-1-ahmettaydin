package com.example.homework1.dto;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ahmet
 */
@Getter
@Setter
public class CountryDto {
    @Id
    private Long id;
    private String name;
    private String president;
}
