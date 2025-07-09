package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    private CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }

    public CountryService(){}

    @Transactional
    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }

    @Transactional
    public Country findCountryByCode(String countryCode) throws CountryNotFoundException {
        Optional<Country> result = countryRepository.findById(countryCode);
        if(result.isEmpty()) throw new CountryNotFoundException("Country not found!");
        Country country = result.get();
        return country;
    }

    @Transactional
    public void addCountry(Country country){
        countryRepository.save(country);
    }
}
