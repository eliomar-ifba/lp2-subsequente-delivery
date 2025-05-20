package edu.ifba.model;

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
public class GrupoUsuario {
    private UUID id;
    private String nome;
    private List<PermissaoUsuario> permissoes;  
}
