/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Card;

/**
 *
 * @author aluno
 */
public class CardDao {
        
    Connection con;
    
    public void inserirCard(Card cd) throws SQLException
    { 
            con = new Conexao().getConnection();
            String sql = "Insert into Cards (Numero,Nome,Clube,Nacionalidade,Liga,Overall) values (?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, cd.getNumber());
            stmt.setString(2, cd.getName());
            stmt.setString(3, cd.getClub());
            stmt.setString(4, cd.getNationality());
            stmt.setString(5, cd.getLeague());
            stmt.setInt(6, cd.getOverall());
            stmt.execute();
            stmt.close();
            con.close();    
    }
    
   public void excluir(String Name) throws SQLException {
        con = new Conexao().getConnection();
        String sql = "DELETE FROM Cards WHERE Nome = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, Name);
        stmt.execute();
        stmt.close();
        con.close();
    }
   
    public ArrayList<Card> buscarCards() throws SQLException  {
        ResultSet rs;
        ArrayList<Card> lista = new ArrayList();
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM Cards";
        PreparedStatement stmt = con.prepareStatement(sql);
        rs = stmt.executeQuery();
        while (rs.next())
        {
            int Numero = rs.getInt("Numero");
            String Nome = rs.getString("Nome");
            String Clube = rs.getString("Clube");
            String Nacionalidade = rs.getString("Nacionalidade");
            String Liga = rs.getString("Liga");
            int Overall = rs.getInt("Overall");
            Card cd = new Card(Numero,Nome,Clube,Nacionalidade,Liga,Overall);
            lista.add(cd);
        }
        stmt.close();
        con.close();   
        return lista;
    }
    
    public ArrayList<Card> buscarPorNome(String nomeCarta) throws SQLException  {
        ResultSet rs;
        ArrayList<Card> lista = new ArrayList();
        con = new Conexao().getConnection();
           String sql = "SELECT * FROM Cards WHERE Nome LIKE ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, "%" + nomeCarta+ "%");
           rs = stmt.executeQuery();
           while (rs.next())
           {
               int Numero = rs.getInt("Numero");
               String Nome = rs.getString("Nome");
               String Clube = rs.getString("Clube");
               String Nacionalidade = rs.getString("Nacionalidade");
               String Liga = rs.getString("Liga");
               int Overall = rs.getInt("Overall");
               Card cd = new Card(Numero,Nome,Clube,Nacionalidade,Liga,Overall);
               lista.add(cd);
           }
           stmt.close();
           con.close();   
           return lista;
    }
    
}
