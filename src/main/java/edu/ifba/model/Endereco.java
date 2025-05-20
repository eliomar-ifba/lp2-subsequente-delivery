package edu.ifba.model;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Endereco {
    private String lagradouro;
    private String cep;
    private String numero;
    private String bairro;
    private String complemento;
    private Cidade cidade;

}
