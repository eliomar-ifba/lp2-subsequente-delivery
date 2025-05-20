package edu.ifba.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produto {
    private UUID id;
    private String nome;
    private String codigoBarras;
    private String descricao;
    private BigDecimal valor;
    private Boolean ativo;
    private List<String> tags;
    private Loja loja;
    private List<FotoProduto> fotos;
    private List<CategoriaProduto> categorias;
}
