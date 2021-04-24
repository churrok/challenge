package objetos;

import java.io.Serializable;

public class Tarjeta implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1284565047860362136L;
	private int id;
	private int mes;
	private int anio;
	private Persona duenio;
	private Marca marca;
	public Tarjeta(int id, int mes, int anio, Persona duenio, Marca marca) {
		super();
		this.id = id;
		this.mes = mes;
		this.anio = anio;
		this.duenio = duenio;
		this.marca = marca;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public Persona getDuenio() {
		return duenio;
	}
	public void setDuenio(Persona duenio) {
		this.duenio = duenio;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anio;
		result = prime * result + ((duenio == null) ? 0 : duenio.hashCode());
		result = prime * result + id;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + mes;
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
		Tarjeta other = (Tarjeta) obj;
		if (anio != other.anio)
			return false;
		if (duenio == null) {
			if (other.duenio != null)
				return false;
		} else if (!duenio.equals(other.duenio))
			return false;
		if (id != other.id)
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Tarjeta [id=" + id + ", mes=" + mes + ", anio=" + anio + ", duenio=" + duenio + ", marca=" + marca
				+ "]";
	}
	
	

}
