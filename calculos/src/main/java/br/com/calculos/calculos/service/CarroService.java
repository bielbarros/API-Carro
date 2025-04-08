package br.com.calculos.calculos.service;

import br.com.calculos.calculos.entity.Carro;
import br.com.calculos.calculos.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public List<Carro> listarCarros() {
        return carroRepository.findAll();
    }

    public void deletarCarros(Long id) {
        if(carroRepository.existsById(id)){
            carroRepository.deleteById(id);
        } else {
            throw new RuntimeException("Carro não encontrado!");
        }
    }

    public Carro atualizarCarro(Long id, Carro novoCarro) {
        Optional<Carro> carroExistente = carroRepository.findById(id);
        if (carroExistente.isPresent()) {
            Carro carro = carroExistente.get();
            carro.setNome(novoCarro.getNome());
            carro.setModelo(novoCarro.getModelo());
            carro.setMarca(novoCarro.getMarca());
            carro.setAnoFabricacao(novoCarro.getAnoFabricacao());
            return carroRepository.save(carro);
        } else {
            throw new RuntimeException("Carro não encontrado");
        }
    }



}
