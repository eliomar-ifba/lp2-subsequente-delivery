package edu.ifba.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemPedido {
    private Integer quantidade;
    private BigDecimal valorTotal;
    private String observacao;
    private Pedido pedido;

}
