package com.example.library.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;


    @Column
    String ISBN;
    @Column
    Integer store_time;
    @Column
    Integer status;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setStore_time(Integer store_time) {
        this.store_time = store_time;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }



    public Integer getId() {
        return id;
    }

    public String getISBN() {
        return ISBN;
    }

    public Integer getStore_time() {
        return store_time;
    }

    public Integer getStatus() {
        return status;
    }





}