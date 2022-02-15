package com.olam.country.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olam.country.service.entities.Country;
import com.olam.country.service.repositories.CountryRepository;

import javassist.NotFoundException;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	public List<Country> all() {
		List<Country> countries = new ArrayList<>();
		countryRepository.findAll().forEach(countries::add);
		
		return countries;
	}
	
	@SuppressWarnings("unchecked")
	public List<Country> get(String postcode) throws Exception {
		return (List<Country>) countryRepository.findById(postcode).orElseThrow(() -> new Exception("suburbs: " + postcode + " not found"));
	}
	
	public void save(Country country) {
		countryRepository.save(country);
		
	}

	public boolean delete(String country) {
		countryRepository.deleteById(country);
		
		return true;
	}
}
