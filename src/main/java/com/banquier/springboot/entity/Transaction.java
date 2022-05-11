package com.banquier.springboot.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="Transaction")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idTransaction")
	private int id;
	private int somme;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dateTransaction;
	@ManyToOne @JoinColumn(name="idCompteDebiteur")
	private Compte debiteur;
	@ManyToOne @JoinColumn(name="idCompteCrediteur")
	private Compte crediteur;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getSomme() {
		return somme;
	}
	public void setSomme(int somme) {
		this.somme = somme;
	}

	public Date getDateTransaction() {
		return dateTransaction;
	}
	public void setDateTransaction(Date dateTransaction){
		this.dateTransaction = dateTransaction;
	}

	public Compte getDebiteur() {
		return debiteur;
	}

	public void setDebiteur(Compte debiteur) {
		this.debiteur = debiteur;
	}

	public Compte getCrediteur() {
		return crediteur;
	}

	public void setCrediteur(Compte crediteur) {
		this.crediteur = crediteur;
	}
}
