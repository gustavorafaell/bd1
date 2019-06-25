/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
    Faz a conexão com o banco de Dados
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ilzi
 */
public class ConexaoBD {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/petShop";
    private static final String USER = "root";
    private static final String PASS = "123";

    public static Connection getConexao() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("erro Conexão: ", ex);
        }
    }

    public static void fechaConexao(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
     public static void fechaConexao(Connection con, PreparedStatement stmt) {
        
         fechaConexao(con);
         
         try {
             
             if(stmt != null){
                 
                 stmt.close();
             }  
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
    public static void fechaConexao(Connection con, PreparedStatement stmt, ResultSet res) {
        
         fechaConexao(con, stmt);
         
         try {
             
             if(res != null){
                 
                 res.close();
             }  
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
         

}
