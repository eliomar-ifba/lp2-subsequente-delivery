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
public class PermissoesUsuario {
    private UUID id;
    private  String nome;
    private String descricao;
    private List<GrupoUsuario> permissoes;
}
