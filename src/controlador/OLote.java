package controlador;

public class OLote implements Comparable<OLote>{

	
	private int almacen;
	private double kg;
	
	
	public OLote(int almacen, double kg) {
		super();
		this.almacen = almacen;
		this.kg = kg;
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