package com.thiagao.pedroso.citiesapi.staties.resource;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagao.pedroso.citiesapi.staties.entites.State;
import com.thiagao.pedroso.citiesapi.staties.repository.StateRepository;

@RestController
@RequestMapping("/staties")
public class StateResource {
	private final StateRepository repository;

	  public StateResource(final StateRepository repository) {
	    this.repository = repository;
	  }

	  @GetMapping
	  public List<State> staties() {
	    return repository.findAll();
	  }
	}