package com.gfe.quest.config.spring;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gfe.quest.dal.CartaModelRepository;
import com.gfe.quest.model.CartaModel;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class DataBaseLoader {
	
	@Bean
	CommandLineRunner initDatabase(CartaModelRepository repository) {
		return args -> {
			log.info("Preloading " + repository.save(new CartaModel("Brujo mecánico", 3, new BigDecimal("35000"))));
			log.info("Preloading " + repository.save(new CartaModel("Rayo cósmico", 2, new BigDecimal("23000"))));
		};
	}
	
}
