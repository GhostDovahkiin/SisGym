package com.example.Gym.Model;

import javax.persistence.Embeddable;

@Embeddable
public class Medidas {

	private double altura;
	private double peso;
	private double cintura;
	private double braco;
	private double panturrilha;
	private Integer gorduraCorporal;
	
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getCintura() {
		return cintura;
	}
	public void setCintura(Double cintura) {
		this.cintura = cintura;
	}
	public Double getBraco() {
		return braco;
	}
	public void setBraco(Double braco) {
		this.braco = braco;
	}
	public Double getPanturrilha() {
		return panturrilha;
	}
	public void setPanturrilha(Double panturrilha) {
		this.panturrilha = panturrilha;
	}
	public Integer getGorduraCorporal() {
		return gorduraCorporal;
	}
	public void setGorduraCorporal(Integer gorduraCorporal) {
		this.gorduraCorporal = gorduraCorporal;
	}
	
	
	
}
