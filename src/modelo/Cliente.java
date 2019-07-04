/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ilzi
 */
public class Cliente {
    
    private int id;
    private String cpf;
    private String nome;
    private String telefone;
    private String endereco;
    private String cidade;
    private String estado;

//    public Cliente(int id, String nome) {
//        this.id = id;
//        this.nome = nome;
//    }
//
//    public Cliente() {
//        
//        this.id = -1;
//        this.nome = null;
//        this.telefone = null;
//        this.endereco = null;
//        this.cidade = null;
//        this.estado = null;
//        
//    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
