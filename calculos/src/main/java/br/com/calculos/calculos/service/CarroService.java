package br.com.calculos.calculos.service;

import br.com.calculos.calculos.entity.Carro;
import br.com.calculos.calculos.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {
    @Autowired // Instância da classe
    private CarroRepository carroRepository;


    public String save(Carro carro) {
        this.carroRepository.save(carro);
        return "Carro salvo com sucesso!";
    }

    public Carro findById(int id) {
        if (id == 1) {
            Carro carro = new Carro();
            carro.setAnoFabricacao(2026);
            carro.setModelo("Spider V12");
            carro.setMarca("Ferrari");
            carro.setNome("Batmovel");

            return carro;
        } else {
            return null;
        }
    }


}
