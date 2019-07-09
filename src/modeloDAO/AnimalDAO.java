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

    public void inserir(Animal a) {

        Connection con = ConexaoBD.getConexao(); // abre a conexão do banco de dados
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO animal (nome,dtNasc,sexo,cor,raca,idCliente) VALUES (?,?,?,?,?,?)");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getDataNasc());
            stmt.setString(3, a.getSexo());
            stmt.setString(4, a.getCor());
            stmt.setString(5, a.getRaca());
            stmt.setInt(6, a.getCliente().getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        } finally {
            ConexaoBD.fechaConexao(con, stmt);
        }

    }

    public List<Animal> listar() {
        Connection con = ConexaoBD.getConexao(); // abre a conexão do banco de dados
        PreparedStatement stmt = null;

        ResultSet rs = null;

        List<Animal> animal = new ArrayList<>(); //Lista para receber cliente

        try {
            stmt = con.prepareStatement("SELECT *FROM animal");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Animal anim = new Animal();
                modelo.Cliente c = new Cliente();
                ClienteDAO daoC = new ClienteDAO();

                anim.setIdAnimal(rs.getInt("idAnimal"));
                anim.setNome(rs.getString("nome"));
                anim.setDataNasc(rs.getString("dtNasc"));
                anim.setSexo(rs.getString("sexo"));
                anim.setCor(rs.getString("cor"));
                anim.setRaca(rs.getString("raca"));
                c = daoC.buscarCodCliente(rs.getInt("idCLiente"));
                anim.setCliente(c);

                animal.add(anim);  //adiciona os dados dentro da lista clientes        

            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            ConexaoBD.fechaConexao(con, stmt, rs);

        }

        return animal;

    }

    public void atualizar(Animal a) {

        Connection con = ConexaoBD.getConexao(); // abre a conexão do banco de dados
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE animal SET nome = ?, dtNasc = ?, sexo = ?, cor = ?, raca = ?, idCliente = ? WHERE idAnimal=?");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getDataNasc());
            stmt.setString(3, a.getSexo());
            stmt.setString(4, a.getCor());
            stmt.setString(5, a.getRaca());
            stmt.setInt(6, a.getCliente().getId());
            stmt.setInt(7, a.getIdAnimal());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Animal Atualizado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar: " + ex);
        } finally {
            ConexaoBD.fechaConexao(con, stmt);
        }

    }

    public List<Animal> listarPorNome(String name) {
        Connection con = ConexaoBD.getConexao(); // abre a conexão do banco de dados
        PreparedStatement stmt = null;

        ResultSet rs = null;

        List<Animal> listAnimal = new ArrayList<>(); //Lista para receber animais

        try {
            stmt = con.prepareStatement("SELECT *FROM animal WHERE nome LIKE ?");
            stmt.setString(1, "%" + name + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                modelo.Cliente c = new Cliente();
                ClienteDAO daoC = new ClienteDAO();
                Animal animal = new Animal();

                animal.setIdAnimal(rs.getInt("idAnimal"));
                animal.setNome(rs.getString("nome"));
                animal.setDataNasc(rs.getString("dtNasc"));
                animal.setSexo(rs.getString("sexo"));
                animal.setCor(rs.getString("cor"));
                animal.setRaca(rs.getString("raca"));

                c = daoC.buscarCodCliente(rs.getInt("idCLiente"));
                animal.setCliente(c);

                listAnimal.add(animal);  //adiciona os dados dentro da lista listAnimal    

            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            ConexaoBD.fechaConexao(con, stmt, rs);

        }

        return listAnimal;

    }

    public void excluir(Animal a) {

        Connection con = ConexaoBD.getConexao(); // abre a conexão do banco de dados
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE from animal WHERE idAnimal=?");
            stmt.setInt(1, a.getIdAnimal());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Animal Excluido");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir: " + ex);
        } finally {
            ConexaoBD.fechaConexao(con, stmt);
        }

    }

}
