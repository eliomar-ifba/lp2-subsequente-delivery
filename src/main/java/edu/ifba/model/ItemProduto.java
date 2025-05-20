package edu.ifba.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItemProduto {
    private Integer quantidade;
    private BigDecimal valorTotal;
    private String observacao;
    private Produto produto;
    
}
