/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Card;
import model.dao.CardDao;

/**
 *
 * @author FernandoVasconcellos
 */
public class CardControl {
    private ArrayList<Card> list;
    private CardDao cardDAO;

    public CardControl()
    {
        
        cardDAO = new CardDao();
    }
    public void incluir (int number, String name, String club, String nationality, String league, int overall) throws SQLException
    {
        Card cd = new Card(number,name, club, nationality, league, overall);
        
            cardDAO.inserirCard(cd);
    }
    
    public ArrayList<Card> BuscarPorNome(String nome)throws SQLException{
        return cardDAO.buscarPorNome(nome);
    }
    
    public ArrayList<Card> BuscarTodos()throws SQLException{
        return cardDAO.buscarCards();
    }
    
    public void ExcluirCard(String nome) throws SQLException{
        cardDAO.excluir(nome);
    }
}
