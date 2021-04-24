package supermenu;
import objetos.Persona;
import objetos.Tarjeta;

import java.util.List;

import objetos.Operacion;


public class Modelo {
	private List<Persona> personas;
	private List<Tarjeta> tarjetas;
	private List<Operacion> operaciones;
	public Modelo(List<Persona> personas, List<Tarjeta> tarjetas, List<Operacion> operaciones) {
		super();
		this.personas = personas;
		this.tarjetas = tarjetas;
		this.operaciones = operaciones;
	}
	public List<Persona> getPersonas() {
		return personas;
	}
	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	public List<Tarjeta> getTarjetas() {
		return tarjetas;
	}
	public void setTarjetas(List<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}
	public List<Operacion> getOperaciones() {
		return operaciones;
	}
	public void setOperaciones(List<Operacion> operaciones) {
		this.operaciones = operaciones;
	}
	
	public Tarjeta getTarjeta(int numero) {
		Tarjeta ret = null;
		for (Tarjeta tarjeta : tarjetas) {
			if(tarjeta.getId() == numero) {
				ret = tarjeta;
			}
		}
		return ret;
	}

}
