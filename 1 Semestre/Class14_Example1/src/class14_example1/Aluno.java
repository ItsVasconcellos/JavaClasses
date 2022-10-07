/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class14_example1;

/**
 *
 * @author Fernando
 */
public class Aluno {
    private int ra;
    private String nome;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        if(ra<0){
            throw new IllegalArgumentException("O ra deve ser positivo!");
        }
        else{
            this.ra = ra;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null){
            throw new NullPointerException("Digite o nome!");
        }
        else if(nome.equals("")){
                throw new StringVaziaException();
            }
            else
            {
                this.nome = nome;
            }
        }
    }

