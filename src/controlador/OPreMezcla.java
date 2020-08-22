package controlador;

import java.util.Date;

public class OPreMezcla {
	
	
	private int codOrd;
	private int empleado;
	private double kg;
	
	private Date fecha;
	private int almacenDestino;

	private int lotePreM;

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

	public int getLotePreM() {
		return lotePreM;
	}

	public void setLotePreM(int lotePreM) {
		this.lotePreM = lotePreM;
	}

	public OPreMezcla(int codOrd, int empleado, double kg, Date fecha, int almacenDestino, int lotePreM) {
		super();
		this.codOrd = codOrd;
		this.empleado = empleado;
		this.kg = kg;
		this.fecha = fecha;
		this.almacenDestino = almacenDestino;
		this.lotePreM = lotePreM;
	}

	@Override
	public String toString() {
		return "OPreMezcla [codOrd=" + codOrd + ", empleado=" + empleado + ", kg=" + kg + ", fecha=" + fecha
				+ ", almacenDestino=" + almacenDestino + ", lotePreM=" + lotePreM + "]";
	}
	
	
}