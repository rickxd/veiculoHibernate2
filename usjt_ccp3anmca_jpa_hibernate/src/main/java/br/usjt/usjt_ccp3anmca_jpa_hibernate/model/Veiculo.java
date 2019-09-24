package br.usjt.usjt_ccp3anmca_jpa_hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veiculo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column (nullable=false, length=200)
	private String modelo;
	
	@Column (nullable=false, length=200)
	private String marca;
	
	@Column (nullable=false, length=200)
	private String anoDeFabricacao;
	
	@Column (nullable=false, length=200)
	private String cor;
	
	@Column (nullable=false, length=200)
	private double tanque;
	
	@Column (nullable=false, length=200)
	private double rendimento;
	
	@Column (nullable=true, length=200)
	private double auto;
	
	public Veiculo() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getAnoDeFabricacao() {
		return anoDeFabricacao;
	}
	public void setAnoDeFabricacao(String anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getTanque() {
		return tanque;
	}

	public void setTanque(double tanque) {
		this.tanque = tanque;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public double getAuto() {
		return auto;
	}

	public void setAuto(double auto) {
		this.auto = auto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anoDeFabricacao == null) ? 0 : anoDeFabricacao.hashCode());
		long temp;
		temp = Double.doubleToLongBits(auto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		temp = Double.doubleToLongBits(rendimento);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(tanque);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (anoDeFabricacao == null) {
			if (other.anoDeFabricacao != null)
				return false;
		} else if (!anoDeFabricacao.equals(other.anoDeFabricacao))
			return false;
		if (Double.doubleToLongBits(auto) != Double.doubleToLongBits(other.auto))
			return false;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (Double.doubleToLongBits(rendimento) != Double.doubleToLongBits(other.rendimento))
			return false;
		if (Double.doubleToLongBits(tanque) != Double.doubleToLongBits(other.tanque))
			return false;
		return true;
	}
}
