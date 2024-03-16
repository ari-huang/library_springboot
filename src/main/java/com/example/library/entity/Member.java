package com.example.library.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;


    @Column
    String phone_number;

    @Column
    String password;

    @Column
    String user_name;

    @Column
    Timestamp registration_time;
    @Column
    Timestamp last_login_time;
    public void setId(Integer id) {
        this.id = id;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setRegistration_time(Timestamp registration_time) {
        this.registration_time = registration_time;
    }

    public void setLast_login_time(Timestamp last_login_time) {
        this.last_login_time = last_login_time;
    }


    public Integer getId() {
        return id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getPassword() {
        return password;
    }

    public String getUser_name() {
        return user_name;
    }

    public Timestamp getRegistration_time() {
        return registration_time;
    }

    public Timestamp getLast_login_time() {
        return last_login_time;
    }


}

