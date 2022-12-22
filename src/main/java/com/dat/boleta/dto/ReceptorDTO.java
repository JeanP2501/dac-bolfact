package com.dat.boleta.dto;

public class ReceptorDTO {
	
	private String tipoComprobante;
	private String tipoDocumento;
	private String nroDocumento;
	private String nombre;
	
	public ReceptorDTO() {
			
	}
		
	public ReceptorDTO(String tipoComprobante, String tipoDocumento, String nroDocumento, String nombre) {
		this();
		this.tipoComprobante = tipoComprobante;
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.nombre = nombre;
	}
	
	public String getTipoComprobante() {
		return tipoComprobante;
	}
	public void setTipoComprobante(String tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "ReceptorDTO [tipoComprobante=" + tipoComprobante + ", tipoDocumento=" + tipoDocumento
				+ ", nroDocumento=" + nroDocumento + ", nombre=" + nombre + "]";
	}
	
}
