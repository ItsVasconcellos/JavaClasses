/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Card {
    private int number;
    private String name;
    private String club;
    private String nationality;
    private String league;
    private int overall;

    public Card(int number, String name, String club, String nationality, String league, int overall) {
        this.number = number;
        this.name = name;
        this.club = club;
        this.nationality = nationality;
        this.league = league;
        this.overall = overall;
    }

    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }
     
}
