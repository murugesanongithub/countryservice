package com.olam.country.service.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.olam.country.service.entities.Country;


@Repository 
@Qualifier("CountryRepository")
public interface CountryRepository extends JpaRepository <Country, String> {

	
}
