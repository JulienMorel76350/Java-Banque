package com.banquier.springboot.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name="Transaction")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idTransaction")
	private int id;
	private int somme;
	private LocalDate dateTransaction;
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

	public LocalDate getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(LocalDate dateTransaction) {
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
