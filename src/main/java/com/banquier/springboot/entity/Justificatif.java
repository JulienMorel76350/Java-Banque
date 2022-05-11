package com.banquier.springboot.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Justificatifs")
public class Justificatif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idJustificatif")
    private int id;
    private boolean typeJustificatif;
    private String pdfJustificatif;
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date created_at;
    @ManyToOne @JoinColumn(name="idClient")
    private Client clientid;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isTypeJustificatif() {
        return typeJustificatif;
    }

    public void setTypeJustificatif(boolean typeJustificatif) {
        this.typeJustificatif = typeJustificatif;
    }

    public String getPdfJustificatif() {
        return pdfJustificatif;
    }

    public void setPdfJustificatif(String pdfJustificatif) {
        this.pdfJustificatif = pdfJustificatif;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        created_at = created_at;
    }

    public Client getClientid() {
        return clientid;
    }

    public void setClientid(Client clientid) {
        this.clientid = clientid;
    }
}
