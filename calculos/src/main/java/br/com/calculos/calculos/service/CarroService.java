package br.com.calculos.calculos.service;

import br.com.calculos.calculos.entity.Carro;
import br.com.calculos.calculos.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarroService {
    @Autowired // Instância da classe
    private CarroRepository carroRepository;


    public String save(Carro carro) {
        this.carroRepository.save(carro);
        return "Carro salvo com sucesso!";
    }

    public Carro findById(Long id) {

        Optional<Carro> carro = this.carroRepository.findById(id);
        return carro.get();
    }


}
