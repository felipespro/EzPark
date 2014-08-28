package com.EZPark.model;

import java.util.Date;



public class AutoDeInfracao {
	private long idInfracao;
	private String tipoInfracao;
	private Veiculo veiculo;
	private Endereco endereco;
	Status status;
	public long getIdInfracao() {
		return idInfracao;
	}
	public void setIdInfracao(long idInfracao) {
		this.idInfracao = idInfracao;
	}
	public String getTipoInfracao() {
		return tipoInfracao;
	}
	public void setTipoInfracao(String tipoInfracao) {
		this.tipoInfracao = tipoInfracao;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
	
}
