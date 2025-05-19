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
    private Genero genero;
    private List<GrupoUsuario> grupos;
    private List<Pedido> pedidos;
    private Endereco enderecoPrincipal;
    private List<Endereco> enderecos;
    
    public Usuario(UUID id, String nomeCompleto, String apelido, String cpf, String email, String senha,
            LocalDateTime dataCadastro, LocalDateTime nascimento, Map<String, String> contatos, String urlFoto,
            Genero genero, List<GrupoUsuario> grupos, List<Pedido> pedidos, Endereco enderecoPrincipal,
            List<Endereco> enderecos) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.apelido = apelido;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
        this.nascimento = nascimento;
        this.contatos = contatos;
        this.urlFoto = urlFoto;
        this.genero = genero;
        this.grupos = grupos;
        this.pedidos = pedidos;
        this.enderecoPrincipal = enderecoPrincipal;
        this.enderecos = enderecos;
    }
    public Usuario() {
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public LocalDateTime getNascimento() {
        return nascimento;
    }
    public void setNascimento(LocalDateTime nascimento) {
        this.nascimento = nascimento;
    }
    public Map<String, String> getContatos() {
        return contatos;
    }
    public void setContatos(Map<String, String> contatos) {
        this.contatos = contatos;
    }
    public String getUrlFoto() {
        return urlFoto;
    }
    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public List<GrupoUsuario> getGrupos() {
        return grupos;
    }
    public void setGrupos(List<GrupoUsuario> grupos) {
        this.grupos = grupos;
    }
    public List<Pedido> getPedidos() {
        return pedidos;
    }
    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    public Endereco getEnderecoPrincipal() {
        return enderecoPrincipal;
    }
    public void setEnderecoPrincipal(Endereco enderecoPrincipal) {
        this.enderecoPrincipal = enderecoPrincipal;
    }
    public List<Endereco> getEnderecos() {
        return enderecos;
    }
    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

}
