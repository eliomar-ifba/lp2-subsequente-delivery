package edu.ifba.model;

import java.math.BigDecimal;
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
public class Produto {
private UUID id;
private String nome;
private String CodigoBarras;
private String descricao;
private BigDecimal valor;
private Boolean ativo;
private List<String> tags;
private List<FotoProduto> fotos;
private List<CategoriaProduto> categorias;
private Loja loja;
}
