package controlador;

public class OLote implements Comparable<OLote>{

	
	private int almacen;
	private double kg;
	private int loteH;
	private int loteDest;
	
	public int getLoteH() {
		return loteH;
	}
	public void setLoteH(int loteH) {
		this.loteH = loteH;
	}
	public int getloteDest() {
		return loteDest;
	}
	public void setloteDest(int loteDest) {
		this.loteDest = loteDest;
	}
	
	
	
	public OLote(int almacen, double kg,int loteH,int loteDest) {
		super();
		this.almacen = almacen;
		this.kg = kg;
		this.loteDest=loteDest;
		this.loteH=loteH;
		
	}
	public int getAlmacen() {
		return almacen;
	}
	public void setAlmacen(int almacen) {
		this.almacen = almacen;
	}
	public double getKg() {
		return kg;
	}
	public void setKg(double kg) {
		this.kg = kg;
	}
	@Override
	public int compareTo(OLote o) {
		
		if(almacen<o.almacen) {
		// TODO Auto-generated method stub
		return -1;
	}
	if(almacen>o.almacen) {
		return 1;
	}
	return 0;
}
}