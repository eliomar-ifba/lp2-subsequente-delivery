package edu.ifba.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;


public class Usuario {
    private UUID id;
    private String nomeCompleto;
    private String apelido;
    private String cpf;
    private String email;
    private String senha;
    private LocalDateTime dataCadastro;
    private LocalDateTime nascimento;
    private Map<String, String> contatos;
    private String urlFoto;
    private Endereco enderecoPrincipal;
    private List<Endereco> enderecos;
    private Genero genero;
    private List<GrupoUsuario> grupos;
    private List<Pedido> pedidos;

}
