package com.example.Gym.Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Aluno")
public class Aluno extends Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name = "DataPagamento")
	private LocalDate dataPagamento;

	private TipoDePlano plano;
	
	private TipoDeSituacao situacao;
	
	@Embedded
	private Medidas medidas;
	
	
	public Medidas getMedidas() {
		return medidas;
	}

	public void setMedidas(Medidas medidas) {
		this.medidas = medidas;
	}

	public Aluno(Long id, @NotNull LocalDate dataPagamento, TipoDePlano plano, TipoDeSituacao situacao, Medidas medidas) {
		super();
		this.id = id;
		this.dataPagamento = dataPagamento;
		this.plano = plano;
		this.situacao = situacao;
		this.medidas = medidas;

	}
	
	public Aluno() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public TipoDePlano getPlano() {
		return plano;
	}

	public void setPlano(TipoDePlano plano) {
		this.plano = plano;
	}

	public TipoDeSituacao getSituacao() {
		return situacao;
	}

	public void setSituacao(TipoDeSituacao situacao) {
		this.situacao = situacao;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
