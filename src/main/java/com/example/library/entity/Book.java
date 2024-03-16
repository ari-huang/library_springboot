package com.example.library.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table
public class Book {
    @Id
    String ISBN;
    @Column
    String name;
    @Column
    Integer author;
    @Column
    Integer introduction;
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public void setIntroduction(Integer introduction) {
        this.introduction = introduction;
    }



    public String getISBN() {
        return ISBN;
    }

    public String getName() {
        return name;
    }

    public Integer getAuthor() {
        return author;
    }

    public Integer getIntroduction() {
        return introduction;
    }







}