package com.banquier.springboot.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="Clients")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idclient")
	private int id;
	private int sexe;
	private String firstname;
	private String lastname;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date birthDay;
	private String adresse;
	private String ville;
	private String pays;
	private String codePostal;
	private String tel;
	private String numClient;
	private String mdpClient;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date Created_at;



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

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getNumClient() {
		return numClient;
	}

	public void setNumClient(String numClient) {
		this.numClient = numClient;
	}

	public String getMdpClient() {
		return mdpClient;
	}

	public void setMdpClient(String mdpClient) {
		this.mdpClient = mdpClient;
	}

	public Date getCreated_at() {
		return Created_at;
	}

	public void setCreated_at(Date created_at) {
		Created_at = created_at;
	}
}
