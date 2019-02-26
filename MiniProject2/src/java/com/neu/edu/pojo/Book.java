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
public class Book {
    private String isbn;
    private String bookTitle;
    private String authors;
    private float price;

    public Book(String isbn, String bookTitle, String authors, float price) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authors = authors;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
}
