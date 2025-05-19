package edu.ifba.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemPedido {
    private Integer quantidade;
    private BigDecimal valorTotal;
    private String observacao;
    private Produto produto;
}
