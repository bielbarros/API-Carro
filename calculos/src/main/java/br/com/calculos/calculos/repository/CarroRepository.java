package br.com.calculos.calculos.repository;

import br.com.calculos.calculos.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}

