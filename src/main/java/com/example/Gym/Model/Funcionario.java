package com.example.Gym.Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Funcionario")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name = "Turno")
	private String turno;
	
	@NotNull
	@Column(name = "DataPagamento")
	private LocalDate dataPagamento;
	
	@NotNull
	@Column(name = "Salario")
	private double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(Long id, @NotNull String turno, @NotNull LocalDate dataPagamento, double salario) {
		super();
		this.id = id;
		this.turno = turno;
		this.dataPagamento = dataPagamento;
		this.salario = salario;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public LocalDate getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
