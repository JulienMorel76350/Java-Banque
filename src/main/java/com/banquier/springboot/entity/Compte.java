package com.banquier.springboot.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Comptes")
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCompte")
    private int id;
    private int solde;
    private int decouvert;
    private int typeCompte;
    private int taux;
    private int dividende;
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date ouvertureCompte;
    @ManyToOne @JoinColumn(name="idClient")
    private Client clientid;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getSolde() {
        return solde;
    }
    public void setSolde(int solde) {
        this.solde = solde;
    }

    public int getDecouvert() {
        return decouvert;
    }
    public void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
    }

    public int getTypeCompte() {
        return typeCompte;
    }
    public void setTypeCompte(int typeCompte) {
        this.typeCompte = typeCompte;
    }

    public int getTaux() {
        return taux;
    }
    public void setTaux(int taux) {
        this.taux = taux;
    }

    public int getDividende() {
        return dividende;
    }
    public void setDividende(int dividende) {
        this.dividende = dividende;
    }

    public Date getOuvertureCompte() {
        return ouvertureCompte;
    }
    public void setOuvertureCompte(Date ouvertureCompte){
        this.ouvertureCompte = ouvertureCompte;
    }

    public Client getClientid() {
        return clientid;
    }
    public void setClientid(Client clientid) {
        this.clientid = clientid;
    }
}
