package controlador;

import java.util.Date;

public class OPreMezcla {
	
	
	private int codOrd;
	private int empleado;
	private double kg;
	private int lote;
	private Date fecha;
	private int almacenDestino;
	private int almacenOrigen;
	private int lotePreM;
	
	
	public OPreMezcla(int codOrd, int empleado, double kg, int lote, Date fecha, int almacenDestino, int almacenOrigen,
			int lotePreM) {
		super();
		this.codOrd = codOrd;
		this.empleado = empleado;
		this.kg = kg;
		this.lote = lote;
		this.fecha = fecha;
		this.almacenDestino = almacenDestino;
		this.almacenOrigen = almacenOrigen;
		this.lotePreM = lotePreM;
	}
	public int getCodOrd() {
		return codOrd;
	}
	public void setCodOrd(int codOrd) {
		this.codOrd = codOrd;
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
	public int getAlmacenDestino() {
		return almacenDestino;
	}
	public void setAlmacenDestino(int almacenDestino) {
		this.almacenDestino = almacenDestino;
	}
	public int getAlmacenOrigen() {
		return almacenOrigen;
	}
	public void setAlmacenOrigen(int almacenOrigen) {
		this.almacenOrigen = almacenOrigen;
	}
	public int getLotePreM() {
		return lotePreM;
	}
	public void setLotePreM(int lotePreM) {
		this.lotePreM = lotePreM;
	}
	
	
	

}
