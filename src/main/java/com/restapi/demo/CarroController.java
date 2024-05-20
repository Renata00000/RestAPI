package com.restapi.demo;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import lombok.AllArgsConstructor;

@RequestMapping
@RestController
@AllArgsConstructor
public class CarroController {

    //vou dizer que e um getMett no meu / carro ele retorna uma lista de carro usando metodo getAllcarros colocando no return quemn tem tds os carros que no casdo e meu repositorio

    CarroRepository repository;

    @GetMapping("/carro")
    public List<Carro> getAllCaroos() {
        return repository.findAll(); //pega tds oscarros
    }

    @GetMapping("/carro/{id}") //pegando um carro por id
    public Carro getCarroById(@PathVariable long id){
        return repository.findById(id).get();
    }

    @PostMapping("Carro")  //retorno do carro que esta em bory
    public Carro saveCarro(@RequestBody Carro carro){
        return repository.save(carro);
    }
    @DeleteMapping("/carro{id}")
    public void deleteCarro(@PathVariable Long id){
        repository.deleteById(id);
    }


}