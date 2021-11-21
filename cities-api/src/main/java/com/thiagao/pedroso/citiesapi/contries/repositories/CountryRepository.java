package com.thiagao.pedroso.citiesapi.contries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagao.pedroso.citiesapi.contries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
