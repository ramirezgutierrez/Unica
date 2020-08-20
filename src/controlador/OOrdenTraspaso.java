package controlador;

import java.util.Date;

public class OOrdenTraspaso {
	
	private int codord;
	private int empleado;
	private double kg;
	private int lote;
	private Date fecha;
	private int almOrigen;
	private int almDestino;
	
	
	
	
	public OOrdenTraspaso(int codord, int empleado, double kg, int lote, Date fecha, int almOrigen, int almDestino) {
		super();
		this.codord = codord;
		this.empleado = empleado;
		this.kg = kg;
		this.lote = lote;
		this.fecha = fecha;
		this.almOrigen = almOrigen;
		this.almDestino = almDestino;
	}
	public int getCodord() {
		return codord;
	}
	public void setCodord(int codord) {
		this.codord = codord;
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
	public int getLote() {
		return lote;
	}
	public void setLote(int lote) {
		this.lote = lote;
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
	

	@Override
	public String toString() {
		return "OOrdenTraspaso [codord=" + codord + ", empleado=" + empleado + ", kg=" + kg + ", fecha=" + fecha
				+ ", almOrigen=" + almOrigen + ", almDestino=" + almDestino + "]";
	}
	
	
	

}
