package controlador;

import javax.swing.JTextField;

public class Oproveedores {
	
	
	
	

	@Override
	public String toString() {
		return "Oproveedores [id=" + id + ", nombre=" + nombre + ", razon=" + razon + ", dni=" + dni + ", direccion="
				+ direccion + ", poblacion=" + poblacion + ", ciudad=" + ciudad + ", pais=" + pais + ", cp=" + cp
				+ ", correo=" + correo + ", fax=" + fax + ", telp=" + telp + ", tels=" + tels + ", observaciones="
				+ observaciones + "]";
	}
	public Oproveedores(int id, String nombre, String razon, String dni, String direccion, String poblacion,
			String ciudad, String pais, int cp, String correo, int fax, int telp, int tels, String observaciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.razon = razon;
		this.dni = dni;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.ciudad = ciudad;
		this.pais = pais;
		this.cp = cp;
		this.correo = correo;
		this.fax = fax;
		this.telp = telp;
		this.tels = tels;
		this.observaciones = observaciones;
	}
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
	public String getRazon() {
		return razon;
	}
	public void setRazon(String razon) {
		this.razon = razon;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public int getFax() {
		return fax;
	}
	public void setFax(int fax) {
		this.fax = fax;
	}
	public int getTelp() {
		return telp;
	}
	public void setTelp(int telp) {
		this.telp = telp;
	}
	public int getTels() {
		return tels;
	}
	public void setTels(int tels) {
		this.tels = tels;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	private int id;
	private String nombre;
	private String razon;
	private String dni;
	private String direccion;
	private String poblacion;
	private String ciudad;
	private String pais;
	private int cp;
	private String correo;	
	private int fax;
	private int telp;
	private int tels;
	private String observaciones;

	
	}
	
	
	
	
	
	
	
	
	

