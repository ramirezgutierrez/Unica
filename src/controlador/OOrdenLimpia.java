package controlador;

import java.util.Date;

public class OOrdenLimpia {
	
	
	private int codOrden;
	private int empleado;
	private double kg;
	private int loteMezcla;
	private Date fecha;
	private int almOrigen;
	private int almDestino;
	private double merma;
	public int getCodOrden() {
		return codOrden;
	}
	public void setCodOrden(int codOrden) {
		this.codOrden = codOrden;
	}
	public int getEmpleado() {
		return empleado;
	}
	public void setEmpleado(int empleado) {
		this.empleado = empleado;
	}
	public double getKg() {
		return kg;
	}
	public void setKg(double kg) {
		this.kg = kg;
	}
	public int getLoteMezcla() {
		return loteMezcla;
	}
	public void setLoteMezcla(int loteMezcla) {
		this.loteMezcla = loteMezcla;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getAlmOrigen() {
		return almOrigen;
	}
	public void setAlmOrigen(int almOrigen) {
		this.almOrigen = almOrigen;
	}
	public int getAlmDestino() {
		return almDestino;
	}
	public void setAlmDestino(int almDestino) {
		this.almDestino = almDestino;
	}
	public double getMerma() {
		return merma;
	}
	public void setMerma(double merma) {
		this.merma = merma;
	}
	public OOrdenLimpia(int codOrden, int empleado, double kg, int loteMezcla, Date fecha, int almOrigen,
			int almDestino, double merma) {
		super();
		this.codOrden = codOrden;
		this.empleado = empleado;
		this.kg = kg;
		this.loteMezcla = loteMezcla;
		this.fecha = fecha;
		this.almOrigen = almOrigen;
		this.almDestino = almDestino;
		this.merma = merma;
	}
	
	
	

}
