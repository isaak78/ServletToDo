package net.form2.entidade;

import java.io.Serializable;
import java.util.Date;


public class Accao implements Serializable {
	private static final long serialVersionUID = -309513637403441918L;
 
	private Long sessao;
 
	private String inicio;
 
	private String ufcd;
 
	private String sumario;
	
	private String faltas;
	 
	private String formador;
 
	private Date data;

	public Long getSessao() {
		return sessao;
	}

	public void setSessao(Long sessao) {
		this.sessao = sessao;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getUfcd() {
		return ufcd;
	}

	public void setUfcd(String ufcd) {
		this.ufcd = ufcd;
	}

	public String getSumario() {
		return sumario;
	}

	public void setSumario(String sumario) {
		this.sumario = sumario;
	}

	public String getFaltas() {
		return faltas;
	}

	public void setFaltas(String faltas) {
		this.faltas = faltas;
	}

	public String getFormador() {
		return formador;
	}

	public void setFormador(String formador) {
		this.formador = formador;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public Accao() {}
 

}
