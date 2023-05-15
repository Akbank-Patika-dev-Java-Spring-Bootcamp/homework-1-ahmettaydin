package com.example.homework1.service;

import com.example.homework1.model.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ahmet
 */
@Service
public class CountryService {
    private final List<Country> countryList;

    public CountryService() {
        Country country1 = new Country(1L, "UK", "Rishi Sunak");
        Country country2 = new Country(2L, "USA", "Joe Biden");

        countryList = new ArrayList<>();
        countryList.add(country1);
        countryList.add(country2);
    }

    public Country createCountry(Country country) {
        countryList.add(country);
        return country;
    }

    public Country getCountry(Long id) {
        Country country = null;

        for(Country c : countryList) {
            if(c.getId().equals(id)) {
                country = c;
            }
        }

        return country;
    }

    public List<Country> getCountries() {

        return countryList;
    }

    public Country updateCountryByPresident(Long id, String president) {
        Country country = null;
        for(Country c : countryList) {
            if(c.getId().equals(id)) {
                c.setPresident(president);
                country = c;
            }
        }
        return country;
    }
}
