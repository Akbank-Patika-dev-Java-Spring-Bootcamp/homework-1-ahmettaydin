package com.example.homework1.controller;

import com.example.homework1.dto.CountryDto;
import com.example.homework1.mapper.CountryMapper;
import com.example.homework1.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ahmet
 */
@RestController
@RequestMapping("/api/v1/countries")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @PostMapping
    public ResponseEntity<CountryDto> save(@RequestBody CountryDto countryDto) {

        return ResponseEntity.ok(CountryMapper.INSTANCE.toDto(countryService.createCountry(CountryMapper.INSTANCE.toCountry(countryDto)) ));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CountryDto> findById(@PathVariable Long id) {

        return ResponseEntity.ok(CountryMapper.INSTANCE.toDto(countryService.getCountry(id)));
    }

    @GetMapping
    public ResponseEntity<List<CountryDto>> findAll() {

        return ResponseEntity.ok(CountryMapper.INSTANCE.toCountryDtoList(countryService.getCountries()));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CountryDto> updateByPresident(@PathVariable Long id, @RequestBody String president) {
        return ResponseEntity.ok(CountryMapper.INSTANCE.toDto(countryService.updateCountryByPresident(id, president)));
    }
}
