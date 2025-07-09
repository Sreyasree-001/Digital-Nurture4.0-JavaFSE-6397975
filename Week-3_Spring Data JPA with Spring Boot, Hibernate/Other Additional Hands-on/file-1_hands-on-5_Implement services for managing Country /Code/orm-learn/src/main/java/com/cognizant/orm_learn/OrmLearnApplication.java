package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import io.github.cdimascio.dotenv.Dotenv;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.load();
		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));

		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);
		testGetAllCountries();
		//testFindCountryWithCode();
//		testAddCountry();
//		testFindCountryWithCode();
		//testUpdateCountry();

//		testDeleteCountry();

	}

	private static void testAddCountry(){
		LOGGER.info("Start");
		Country country = new Country("NN","New Country");
		countryService.addCountry(country);
		LOGGER.debug("Added Country={}", country);
		LOGGER.info("End");
	}

	private static void testUpdateCountry(){
		LOGGER.info("Start");
		String code = "NN";
		String newName = "Updated Country Name";
		countryService.updateCountry(code,newName);
		Country country = countryService.findCountryByCode(code);
		LOGGER.debug("Updated country={}", country);
		LOGGER.info("End");
	}

	private static void testFindCountryWithCode(){
		LOGGER.info("Start");
		Country country = countryService.findCountryByCode("NN");
		LOGGER.debug("Found country={}", country);
		LOGGER.info("End");
	}

	private static void testGetAllCountries() {
		LOGGER.info("Start");
		List<Country> countries = countryService.getAllCountries();
		LOGGER.debug("countries={}", countries);
		LOGGER.info("End");
	}

	private static void testDeleteCountry(){
		LOGGER.info("Start");
		String code = "NN";
		Country country = countryService.findCountryByCode(code);
		countryService.deleteCountry(code);
		LOGGER.debug("Deleted country:{}", country);
		LOGGER.info("End");
	}
}
