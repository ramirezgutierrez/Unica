package controlador;

import java.util.Date;

public class OrdenCompra {
	
	public OrdenCompra(int codCompra, int idProveedor, double kg, int lote, double kgRestantes, int almacen,
			int empleado, String muestras, Date fecha, String tipoGrano, String envase) {
		super();
		this.codCompra = codCompra;
		this.idProveedor = idProveedor;
		this.kg = kg;
		this.lote = lote;
		this.kgRestantes = kgRestantes;
		this.almacen = almacen;
		this.empleado = empleado;
		this.muestras = muestras;
		this.fecha = fecha;
		this.tipoGrano = tipoGrano;
		this.envase = envase;
	}
	private int codCompra;
	private int idProveedor;
	private double kg;
	private int lote;
	private double kgRestantes;
	private int almacen;
	private int empleado;
	private String muestras;
	private Date fecha;
	private String tipoGrano;
	private String envase;
	public int getCodCompra() {
		return codCompra;
	}
	public void setCodCompra(int codCompra) {
		this.codCompra = codCompra;
	}
	public int getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
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
	public double getKgRestantes() {
		return kgRestantes;
	}
	public void setKgRestantes(double kgRestantes) {
		this.kgRestantes = kgRestantes;
	}
	public int getAlmacen() {
		return almacen;
	}
	public void setAlmacen(int almacen) {
		this.almacen = almacen;
	}
	public int getEmpleado() {
		return empleado;
	}
	public void setEmpleado(int empleado) {
		this.empleado = empleado;
	}
	public String getMuestras() {
		return muestras;
	}
	public void setMuestras(String muestras) {
		this.muestras = muestras;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getTipoGrano() {
		return tipoGrano;
	}
	public void setTipoGrano(String tipoGrano) {
		this.tipoGrano = tipoGrano;
	}
	public String getEnvase() {
		return envase;
	}
	public void setEnvase(String envase) {
		this.envase = envase;
	}
	@Override
	public String toString() {
		return "OrdenCompra [codCompra=" + codCompra + ", idProveedor=" + idProveedor + ", kg=" + kg + ", lote=" + lote
				+ ", kgRestantes=" + kgRestantes + ", almacen=" + almacen + ", empleado=" + empleado + ", muestras="
				+ muestras + ", fecha=" + fecha + ", tipoGrano=" + tipoGrano + ", envase=" + envase + "]";
	}
	
	
	

}
