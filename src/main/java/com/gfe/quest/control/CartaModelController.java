package com.gfe.quest.control;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gfe.quest.dal.CartaModelRepository;
import com.gfe.quest.model.CartaModel;
import com.gfe.quest.model._exceptions.GenericJsonException;

@RestController
public class CartaModelController {

		private final CartaModelRepository repository;

		CartaModelController(CartaModelRepository repository) {
			this.repository = repository;
		}

		// Aggregate root
		@GetMapping("/cartamodels")
		List<CartaModel> all() {
			return repository.findAll();
		}

		@PostMapping("/cartamodels")
		CartaModel newEmployee(@RequestBody CartaModel newCarta) {
			return repository.save(newCarta);
		}

		// Single item
		@GetMapping("/cartamodels/{id}")
		CartaModel one(@PathVariable BigDecimal id) {

			return repository.findById(id)
				.orElseThrow(() -> new GenericJsonException("No se encontró el model de carta con id: " + id, new Throwable()));
		}

		@PutMapping("/cartamodels/{id}")
		CartaModel replaceCarta(@RequestBody CartaModel newCarta, @PathVariable BigDecimal id) {

			return repository.findById(id)
				.map(carta -> {
					carta.setNombre(newCarta.getNombre());
					carta.setNivel(newCarta.getNivel());
					carta.setPrecio(newCarta.getPrecio());
					return repository.save(carta);
				})
				.orElseGet(() -> {
					newCarta.setIdCartaModel(id);
					return repository.save(newCarta);
				});
		}

		@DeleteMapping("/cartas/{id}")
		void deleteCarta(@PathVariable BigDecimal id) {
			repository.deleteById(id);
		}
}
