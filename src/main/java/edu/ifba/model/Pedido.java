package edu.ifba.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pedido {
    private UUID id;
    private String codigo;
    private BigDecimal subTotal;
    private BigDecimal taxaDelivery;
    private BigDecimal valorTotal;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataUltimaAtualizacao;
    private StatusPedido statusPedido;
    private FormaEntrega formaEntrega;
    private Endereco enderecoEntrega;
    private Usuario cliente;
    private Loja loja;
    private List<ItemPedido> itens;
    private FormaPagamento formaPagamento;

}
