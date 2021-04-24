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
	
	public Tarjeta getTarjeta(int numero) throws Exception {
		
			Tarjeta ret = null;
			for (Tarjeta tarjeta : tarjetas) {
				if(tarjeta.getId() == numero) {
					ret = tarjeta;
				}
			}
			if(ret == null) {
				throw(new Exception());
			}
			return ret;
		
	}
	public Persona encontrarDuenio(int tarjeta) {
		for (Tarjeta tarjetaObj : tarjetas) {
			if(tarjetaObj.getId() == tarjeta)return tarjetaObj.getDuenio();
		}
		return null;
	}
	public boolean validarOperacion(int monto, int tarjeta)  throws Exception {
		int sum = 0;
		try {
			
			for (Tarjeta tarjetaObj: tarjetas) {
				if(tarjetaObj.getId() == tarjeta) {
					for (Operacion operacion : operaciones) {
						if (operacion.getTarjeta().getId() == tarjeta) {
							sum = sum + operacion.getMonto();
						}
					}
				}
			}
		} catch (Exception e) {
			throw(e);
		}
		System.out.println("monto total" + sum);
		if(sum>=1000) {
			return false;
		}
		return true;
	}

}
