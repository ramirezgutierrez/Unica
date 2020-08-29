package controlador;

public class ODepositoAcondicionado {

	
	private int id;
	private String tipo;
	private double capacidad;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	
	
	public ODepositoAcondicionado(int id, String tipo, double capacidad) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.capacidad = capacidad;
	}
	
	
}
