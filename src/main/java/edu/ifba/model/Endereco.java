package edu.ifba.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Endereco {
    private String lagradouro;
    private String cep;
    private String numero;
    private String bairro;
    private String complemento;
    private Cidade cidade;
    
}
