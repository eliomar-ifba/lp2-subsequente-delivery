package edu.ifba.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
public class Pedido {
private UUID id;
private String codigo;
private BigDecimal subTotal;
private BigDecimal taxaDelivery;
private BigDecimal valorTotal;
private LocalDateTime dataDescricao;
private LocalDateTime dataUltimaAtualizacao;
private StatusPedido statusPedido;
private Endereco enderecoEntrega;
private FormaEntrega FormaEntrega;
private Usuario cliente;
private List<ItemPedido> itens;
private FormaPagamento formaPagamento;
private Loja loja;

}
