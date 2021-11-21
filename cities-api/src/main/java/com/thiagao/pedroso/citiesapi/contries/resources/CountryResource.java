package com.thiagao.pedroso.citiesapi.contries.resources;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagao.pedroso.citiesapi.contries.entities.Country;
import com.thiagao.pedroso.citiesapi.contries.repositories.CountryRepository;

@RestController
public class CountryResource {
	private final CountryRepository repository;

	  public CountryResource(final CountryRepository repository) {
	    this.repository = repository;
	  }

	  @GetMapping("/countries")
	  public List<Country> cities() {

	    return repository.findAll();
	  }
	}