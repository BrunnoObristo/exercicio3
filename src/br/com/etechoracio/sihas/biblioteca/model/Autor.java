package br.com.etechoracio.sihas.biblioteca.model;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;
@ManagedBean

@Entity
@Table(name="TBL_AUTOR")
public class Autor {


@Getter
@Setter

	@Id
	@GeneratedValue
	@Column(name="ID_AUTOR")
	private Long id;

	@Column(name="TX_NOME")
	private String nome;
	
	@Column(name="DT_INICIO_VIGENCIA")
	private Date dataInicio;
	
	@Column(name="DT_FIM_VIGENCIA")
	private Date dataFim;
}
