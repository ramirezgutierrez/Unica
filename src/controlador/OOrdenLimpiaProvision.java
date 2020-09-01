package controlador;

public class OOrdenLimpiaProvision {
	private int id_alm;	
	private double kg;
	private String accion;
	private double provision;
	private int lote_mezcla;
	private int lote_comprado;
	
	
	public OOrdenLimpiaProvision(int id_alm,int lote_comprado, double kg, String accion, double provision, int lote_mezcla) {
		super();
		this.id_alm = id_alm;
		this.kg = kg;
		this.accion = accion;
		this.provision = provision;
		this.lote_mezcla = lote_mezcla;
		this.lote_comprado=lote_comprado;
		
	}
	public int getLote_comprado() {
		return lote_comprado;
	}
	public void setLote_comprado(int lote_comprado) {
		this.lote_comprado = lote_comprado;
	}
	public int getId_alm() {
		return id_alm;
	}
	public void setId_alm(int id_alm) {
		this.id_alm = id_alm;
	}
	public double getKg() {
		return kg;
	}
	public void setKg(double kg) {
		this.kg = kg;
	}
	public String getAccion() {
		return accion;
	}
	public void setAccion(String accion) {
		this.accion = accion;
	}
	public double getProvision() {
		return provision;
	}
	public void setProvision(double provision) {
		this.provision = provision;
	}
	public int getLote_mezcla() {
		return lote_mezcla;
	}
	public void setLote_mezcla(int lote_mezcla) {
		this.lote_mezcla = lote_mezcla;
	}


 }


