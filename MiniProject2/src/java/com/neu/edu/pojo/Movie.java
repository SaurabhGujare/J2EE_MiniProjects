/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.pojo;

/**
 *
 * @author Saurabh Gujare (NUID : 001424874)
 */
public class Movie {
    private String title;
    private String actor;
    private String actress;
    private String genre;
    private String year;

    public Movie(String title, String actor, String actress, String genre, String year) {
        this.title = title;
        this.actor = actor;
        this.actress = actress;
        this.genre = genre;
        this.year = year;
    }    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActress() {
        return actress;
    }

    public void setActress(String actress) {
        this.actress = actress;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
        
}
