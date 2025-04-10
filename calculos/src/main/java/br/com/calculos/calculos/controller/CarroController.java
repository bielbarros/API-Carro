package br.com.calculos.calculos.controller;

import br.com.calculos.calculos.entity.Carro;
import br.com.calculos.calculos.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Carro carro){

        try {

            String mensagem = this.carroService.save(carro);
            return new ResponseEntity<String>(mensagem, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("Deu algo errado ao salvar", HttpStatus.BAD_REQUEST);
        }
    }
   @GetMapping("/findById/{id}")
    public ResponseEntity<Carro> findById(@PathVariable Long id){
        try {

            Carro carro = this.carroService.findById(id);
            return new ResponseEntity<>(carro, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/lista")
    public List<Carro>listarCarros(){
        return carroService.listarCarros();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCarro(@PathVariable Long id) {
        carroService.deletarCarros(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public Carro atualizarCarro(@PathVariable Long id, @RequestBody Carro carro) {
        return carroService.atualizarCarro(id, carro);
    }

}
