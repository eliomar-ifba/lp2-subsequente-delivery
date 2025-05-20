package edu.ifba.model;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaProduto {
    private UUID Id;
    private String Nome;
    private String descricao;
    private List<Produto> produtos;
    
}
