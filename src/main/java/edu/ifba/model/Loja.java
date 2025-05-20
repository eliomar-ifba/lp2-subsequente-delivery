package edu.ifba.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Loja {
    private UUID id;
    private String nome;
    private LocalDateTime dataCadastro;
    private LocalTime horarioAberta;
    private LocalTime horarioFechada;
    private Boolean aberto;
    private Boolean ativo;
    private Boolean aceitaRetirada;
    private BigDecimal taxaDelivery;
    private Integer tempoMinimoEntrega;
    private Integer tempoMaximoEntrega;
    private Map<String,String> contatos;
    private Map<String,String> redes;
    private String urlFotoBanner;
    private List<Usuario> responsaveis;
    private List<FormaPagamento> formasPagamento;



}
