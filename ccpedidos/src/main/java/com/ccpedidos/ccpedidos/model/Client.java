package com.ccpedidos.ccpedidos.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private double phone;
    private String clientType;

    @Column(columnDefinition = "boolean default true")
    private boolean active;




    public Client(){

    }

    public Client(String name, String email, double phone, String clientType, boolean active){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.clientType = clientType;
        this.active = active;
    }


    public long getClientId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }



    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
