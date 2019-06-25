/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import conexao.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        
        Connection con = ConexaoBD.getConexao();
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
    
}
