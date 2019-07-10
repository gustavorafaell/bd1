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
import modelo.Cliente;

/**
 *
 * @author ilzi
 */
public class ClienteDAO {
    
    public void inserir(Cliente c){
        
        Connection con = ConexaoBD.getConexao(); // abre a conexão do banco de dados
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cliente (cpf,nome,telefone,endereco,cidade,estado) VALUES (?,?,?,?,?,?)");
            stmt.setString(1, c.getCpf());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getTelefone());
            stmt.setString(4, c.getEndereco());
            stmt.setString(5, c.getCidade());
            stmt.setString(6, c.getEstado());    
                     
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex);            
        } finally {
            ConexaoBD.fechaConexao(con, stmt);            
        }
        
    }
    
    public List<Cliente> listar(){
        Connection con = ConexaoBD.getConexao(); // abre a conexão do banco de dados
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Cliente> clientes = new ArrayList<>(); //Lista para receber cliente
        
        try {
            stmt = con.prepareStatement("SELECT *FROM cliente");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Cliente cliente = new Cliente();
                
                cliente.setId(rs.getInt("id"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setEstado(rs.getString("estado"));
                
                clientes.add(cliente);  //adiciona os dados dentro da lista clientes        
                       
            }
            
            
                    
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            ConexaoBD.fechaConexao(con, stmt, rs);
        
        }
        
        return clientes;
    
    }
    public List<Cliente> listarPorNome(String name){
        Connection con = ConexaoBD.getConexao(); // abre a conexão do banco de dados
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Cliente> clientes = new ArrayList<>(); //Lista para receber cliente
        
        try {
            stmt = con.prepareStatement("SELECT *FROM cliente WHERE nome LIKE ?");
            stmt.setString(1,"%"+name+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Cliente cliente = new Cliente();
                
                cliente.setId(rs.getInt("id"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setEstado(rs.getString("estado"));
                
                clientes.add(cliente);  //adiciona os dados dentro da lista clientes        
                       
            }
            
            
                    
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            ConexaoBD.fechaConexao(con, stmt, rs);
        
        }
        
        return clientes;
    
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
        
    public void excluir(Cliente c){
            
        
        Connection con = ConexaoBD.getConexao(); // abre a conexão do banco de dados
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE from cliente WHERE id=?"); 
            stmt.setInt(1, c.getId());
                     
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cliente Excluido");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir: "+ex);            
        } finally {
            ConexaoBD.fechaConexao(con, stmt);            
        }
        
    }  

    public  Cliente buscarCodCliente(int cod){
        Cliente cliente = new Cliente();
        
        Connection con = ConexaoBD.getConexao(); // abre a conexão do banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT id, nome, telefone FROM cliente WHERE id = '"+cod+"'");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                               
                cliente.setId(rs.getInt("id"));                
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));
                                      
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar: "+ex); 
        } finally {
            ConexaoBD.fechaConexao(con, stmt);            
        }
    
        return cliente;
    
    }   
        

    
    
    
    
    
}
