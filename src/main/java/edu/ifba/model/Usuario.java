package edu.ifba.model;

import java.time.LocalDateTime;
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
public class Usuario {

    private  UUID id;
    private String nomeCompleto;
    private  String apelido;
    private String cpf;
    private  String email;
    private  String senha;
    private  LocalDateTime dataCadastro;
    private LocalDateTime nascimento;
    private  Map<String,String> contatos;
    private String urlFoto;
    private Genero genero;
    private List<GrupoUsuario> lista;
    private  List<Pedido> pedidos;
    private Endereco enderecoPrincipal;
    private List<Endereco> enderecos;

    
}
