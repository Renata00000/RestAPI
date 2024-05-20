package com.restapi.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  // significa que sera salvo no banco de dados
@Data //lomboc
@AllArgsConstructor // construtor com parametros
@NoArgsConstructor // construtor sem parametros
public class Carro {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // vai gerar da forma automatica
    Long id;
    String marca;
    Integer ano;

}
