/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Aluno;
import model.DAO.AlunoDAO;

/**
 *
 * @author aluno
 */
public class AlunoControl {
    private ArrayList<Aluno> list;
    AlunoDAO alDao;
    public AlunoControl()
    {
        //list=new ArrayList<>();
        alDao = new AlunoDAO();
    }
    public void incluir (int ra,String nome)
    {
        Aluno a1 = new Aluno(ra,nome);
        //list.add(a1);
        try{
            alDao.inserirAluno(a1);
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
    }
    
    }
}
