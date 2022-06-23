package com.banquier.springboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="Banquiers")
public class Banquier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idBanquier")
    private int id;
    private int sexe;
    private String firstname;
    private String lastname;
    private Boolean admin;
    @OneToOne
    @JoinColumn(name="idUser")
    private User user;

    public Banquier() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSexe() {
        return sexe;
    }
    public void setSexe(int sexe) {
        this.sexe = sexe;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Boolean getAdmin() {
        return admin;
    }
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
}
