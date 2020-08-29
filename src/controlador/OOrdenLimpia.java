package controlador;

import java.util.Date;

public class OOrdenLimpia {
	
	
	private int codOrden;
	private int empleado;
	private double kg;
	private int loteMezcla;
	private Date fecha;
	private int almOrigen;
	private int depAcondicionado;
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
	public int getDepAcondicionado() {
		return depAcondicionado;
	}
	public void setDepAcondicionado(int almDestino) {
		this.depAcondicionado = almDestino;
	}
	public double getMerma() {
		return merma;
	}
	public void setMerma(double merma) {
		this.merma = merma;
	}
	public OOrdenLimpia(int codOrden, int empleado, double kg, int loteMezcla, Date fecha, int almOrigen,
			int depAcondicionado, double merma) {
		super();
		this.codOrden = codOrden;
		this.empleado = empleado;
		this.kg = kg;
		this.loteMezcla = loteMezcla;
		this.fecha = fecha;
		this.almOrigen = almOrigen;
		this.depAcondicionado = depAcondicionado;
		this.merma = merma;
	}
	
	int lote;
	int tipo;
	public OOrdenLimpia(int lote,int tipo) {
		
		this.lote=lote;
		this.tipo=tipo;
		
		
		
	}
	public int getLote() {
		return lote;
	}
	public void setLote(int lote) {
		this.lote = lote;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
