package edu.ifba.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pedido {
    private UUID id;
    private String codigo;
    private BigDecimal subTotal;
    private BigDecimal taxaDelivery;
    private BigDecimal valortotal;
    private LocalDateTime dataDescricao;
    private LocalDateTime dataUltimaAtualizacao;
    private StatusPedido statusPedido;
    private FormaEntrega formaEntrega;
    private Endereco enderecoEntrega;
    private Usuario cliente;
    private Loja loja;
    private FormaPagamento formaPagamento;
    private List<ItemPedido> intens;
    
}
