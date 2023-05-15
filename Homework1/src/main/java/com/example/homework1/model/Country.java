package com.example.homework1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author ahmet
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    @Id
    @GeneratedValue(generator = "Country", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "Country", sequenceName = "COUNTRY_ID_SEQ")
    private Long id;
    private String name;
    private String president;
}
