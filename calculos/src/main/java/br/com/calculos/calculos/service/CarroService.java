package br.com.calculos.calculos.service;

import br.com.calculos.calculos.entity.Carro;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

    private


    public String save(Carro carro) {
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
