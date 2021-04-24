package objetos;

import java.io.Serializable;

public class Operacion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8252286940379231643L;
	private Tarjeta tarjeta;
	private int monto;
	public Operacion(Tarjeta tarjeta, int monto) {
		super();
		this.tarjeta = tarjeta;
		this.monto = monto;
	}
	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	
	

}
