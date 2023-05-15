package com.example.homework1.mapper;

import com.example.homework1.dto.CountryDto;
import com.example.homework1.model.Country;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author ahmet
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CountryMapper {
    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);
    CountryDto toDto(Country country);
    Country toCountry(CountryDto countryDto);
    List<CountryDto> toCountryDtoList(List<Country> countryList);
}
