/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import conexao.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Animal;
import modelo.Cliente;

/**
 *
 * @author ilzi
 */
public class AnimalDAO {
    public void inserir(Animal a){
        
        Connection con = ConexaoBD.getConexao(); // abre a conexão do banco de dados
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO animal (nome,dtNasc,sexo,cor,raca,idCliente) VALUES (?,?,?,?,?)");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getDataNasc());
            stmt.setString(3, a.getSexo());
            stmt.setString(4, a.getCor());
            stmt.setString(5, a.getRaca());
            stmt.setInt(6, a.getCliente().getId());         
                     
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex);            
        } finally {
            ConexaoBD.fechaConexao(con, stmt);            
        }
        
    }
    
    public List<Animal> listar(){
        Connection con = ConexaoBD.getConexao(); // abre a conexão do banco de dados
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Animal> animal = new ArrayList<>(); //Lista para receber cliente
        
        try {
            stmt = con.prepareStatement("SELECT *FROM animal");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Animal anim = new Animal();
                
               
                anim.setIdAnimal(rs.getInt("id"));
                anim.setNome(rs.getString("nome"));
                anim.setDataNasc(rs.getString("dataNasc"));
                anim.setSexo(rs.getString("sexo"));
                
                
                anim.add(animal);  //adiciona os dados dentro da lista clientes        
                       
            }
            
            
                    
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            ConexaoBD.fechaConexao(con, stmt, rs);
        
        }
        
        return animal;
    
    }
    
     public void atualizar(Cliente c){
        
        Connection con = ConexaoBD.getConexao(); // abre a conexão do banco de dados
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE cliente SET cpf = ?, nome = ?, telefone = ?, endereco = ?, cidade = ?, estado = ? WHERE id=?");
            stmt.setString(1, c.getCpf());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getTelefone());
            stmt.setString(4, c.getEndereco());
            stmt.setString(5, c.getCidade());
            stmt.setString(6, c.getEstado());  
            stmt.setInt(7, c.getId());
                     
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cliente Atualizado");    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar: "+ex);            
        } finally {
            ConexaoBD.fechaConexao(con, stmt);            
        }
        
    }
    
    
    
    
    
}
