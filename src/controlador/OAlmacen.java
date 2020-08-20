package controlador;

public class OAlmacen {

	public OAlmacen(int id, String nombre, String tipoAlmacen, double capacidad, String situacion, String ubicacion,double kagAlmacenados) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipoAlmacen = tipoAlmacen;
		this.capacidad = capacidad;
		this.situacion = situacion;
		this.ubicacion = ubicacion;
		this.kgAlmacenados=kagAlmacenados;
	}

	public double getKgAlmacenados() {
		return kgAlmacenados;
	}

	public void setKgAlmacenados(double kgAlmacenados) {
		this.kgAlmacenados = kgAlmacenados;
	}

	
	@Override
	public String toString() {
		return "OAlmacen [id=" + id + ", nombre=" + nombre + ", tipoAlmacen=" + tipoAlmacen + ", capacidad=" + capacidad
				+ ", situacion=" + situacion + ", ubicacion=" + ubicacion + ", kgAlmacenados=" + kgAlmacenados + "]";
	}


	private int id;
	private String nombre;
	private String tipoAlmacen;
	private double capacidad;
	private String situacion;
	private String ubicacion;
	private double kgAlmacenados;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoAlmacen() {
		return tipoAlmacen;
	}

	public void setTipoAlmacen(String tipoAlmacen) {
		this.tipoAlmacen = tipoAlmacen;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public String getSituacion() {
		return situacion;
	}

	public void setSituacion(String situacion) {
		this.situacion = situacion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

}
