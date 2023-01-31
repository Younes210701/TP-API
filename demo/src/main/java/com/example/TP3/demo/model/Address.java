package com.example.TP3.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;



import java.util.Date;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private String nom ;
    private Long id;
    private java.sql.Date creation;
    private String content;
    public java.sql.Date getCreation() {
        return creation;
    }

    public void setCreation(java.sql.Date creation) {
        this.creation = creation;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
