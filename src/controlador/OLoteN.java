package controlador;

public class OLoteN {
	private int lote;
	private String origen;
	public int getLote() {
		return lote;
	}
	public void setLote(int lote) {
		this.lote = lote;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public OLoteN(int lote, String origen) {
		super();
		this.lote = lote;
		this.origen = origen;
	}
	@Override
	public String toString() {
		return "" + lote ;
	}
	
	
	
	
	

}
