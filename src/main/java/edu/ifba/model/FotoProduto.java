package edu.ifba.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FotoProduto {
    private UUID id;
    private String titulo;
    private String descricao;
    private String url;   
}
