package com.gfe.quest.dal;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gfe.quest.model.CartaModel;

public interface CartaModelRepository extends JpaRepository <CartaModel, BigDecimal>{

}
