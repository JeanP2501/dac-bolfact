package com.dat.boleta.dto;

public class EmisorDTO {

	private int empresaId;
	private String ruc;
	private String nombreLegal;
	private String nombreComercial;
	private String direccion;
	private String urbanizacion;
	private String departamento;
	private String provincia;
	private String distrito;
	private String firmaId;
	
	public EmisorDTO() {}
	
	public EmisorDTO(int empresaId, String ruc, String nombreLegal, String nombreComercial, String direccion,
			String urbanizacion, String departamento, String provincia, String distrito, String firmaId) {
		this();
		this.empresaId = empresaId;
		this.ruc = ruc;
		this.nombreLegal = nombreLegal;
		this.nombreComercial = nombreComercial;
		this.direccion = direccion;
		this.urbanizacion = urbanizacion;
		this.departamento = departamento;
		this.provincia = provincia;
		this.distrito = distrito;
		this.firmaId = firmaId;
	}

	public int getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(int empresaId) {
		this.empresaId = empresaId;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getNombreLegal() {
		return nombreLegal;
	}

	public void setNombreLegal(String nombreLegal) {
		this.nombreLegal = nombreLegal;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getUrbanizacion() {
		return urbanizacion;
	}

	public void setUrbanizacion(String urbanizacion) {
		this.urbanizacion = urbanizacion;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getFirmaId() {
		return firmaId;
	}

	public void setFirmaId(String firmaId) {
		this.firmaId = firmaId;
	}
	
	@Override
	public String toString() {
		return "EmisorDTO   [empresaId=" + empresaId + ", ruc=" + ruc + ", nombreLegal=" + nombreLegal
				+ ", nombreComercial=" + nombreComercial + ", direccion=" + direccion + ", urbanizacion=" + urbanizacion
				+ ", departamento=" + departamento + ", provincia=" + provincia + ", distrito=" + distrito
				+ ", firmaId=" + firmaId + "]";
	}
	
}
