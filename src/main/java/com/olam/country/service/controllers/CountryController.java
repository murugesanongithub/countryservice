package com.olam.country.service.controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.olam.country.service.entities.Country;
import com.olam.country.service.services.CountryService;

import javassist.NotFoundException;

import org.springframework.core.env.Environment;

@RestController
public class CountryController {
	

	@Autowired
	private CountryService countryService;
	
	
	@GetMapping("/")
	public List<Country> getAll() {
		return countryService.all();
	}
	
	@GetMapping("/code/{postcode}")
	public List<Country> getCountry(@PathVariable String postcode) throws Exception {
		List<Country>  suburbList  = (List<Country>) countryService.get(postcode);
		
		
		return suburbList;			
	}	
}
