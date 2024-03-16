package com.example.library.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table
public class Record {
    @Id
    String user_id;
    @Column
    String inventory_id;
    @Column
    Timestamp borrowing_time;
    @Column
    Timestamp return_time;
    public String getUser_id() {
        return user_id;
    }

    public String getInventory_id() {
        return inventory_id;
    }

    public Timestamp getBorrowing_time() {
        return borrowing_time;
    }

    public Timestamp getReturn_time() {
        return return_time;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setInventory_id(String inventory_id) {
        this.inventory_id = inventory_id;
    }

    public void setBorrowing_time(Timestamp borrowing_time) {
        this.borrowing_time = borrowing_time;
    }

    public void setReturn_time(Timestamp return_time) {
        this.return_time = return_time;
    }

}