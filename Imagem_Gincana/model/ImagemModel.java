package br.edu.ifba.backend.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tarefa")
public class ImagemModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	@Column(name = "data_criacao", nullable = true)
	private Date data_criacao;
	
	@Column(name = "data_conclusao", nullable = true)
	private Date data_conclusao;
	
	@Column(name = "status", nullable = true)
	private Boolean status;
	
	public ImagemModel() {
		super();
	}

	public ImagemModel(long id, String descricao, Date data_criacao) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.data_criacao = data_criacao;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(Date data_criacao) {
		this.data_criacao = data_criacao;
	}

	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getDescricao() + ":" + this.getData_criacao();
	}
	
}
