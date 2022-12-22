package com.dat.boleta.dto;

import java.text.DecimalFormat;

public class DocumentoDTO {
	
	private String tipo;
	private String fechaEmision;
	private String horaEmision;
	private String serieNumero;
	private String identificador;
	private int idValorVenta;
	private int idMontoEnLetras;
	private String valorVenta;
	private String igvVenta;
	private String totalVenta;
	private String descuentoVenta;
	private String montoLetras;
	private boolean gravadas;
	private boolean exoneradas;
	private boolean gratuitas;
	private boolean descuentos;
	private int items;
	
	private static int ultimoId = 0;
	
	public DocumentoDTO() {
		this.idValorVenta = (++ultimoId)+1000;
	}

	public DocumentoDTO(String tipo, int idMontoEnLetras, String valorVenta, String descuentoVenta,
			boolean gravadas, boolean exoneradas, boolean gratuitas, boolean descuentos, int items) {
		this();
		this.tipo = tipo;
		this.idMontoEnLetras = idMontoEnLetras;
		this.valorVenta = valorVenta; 
		this.descuentoVenta = descuentoVenta;
		this.gravadas = gravadas;
		this.exoneradas = exoneradas;
		this.gratuitas = gratuitas;
		this.descuentos = descuentos;
		this.items = items;
	}
	
	DecimalFormat formatNro = new DecimalFormat("0.00");
		
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getHoraEmision() {
		return horaEmision;
	}

	public void setHoraEmision(String horaEmision) {
		this.horaEmision = horaEmision;
	}

	public String getSerieNumero() {
		return serieNumero;
	}

	public void setSerieNumero(String serieNumero) {
		this.serieNumero = serieNumero;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public int getIdValorVenta() {
		return idValorVenta;
	}

	public void setIdValorVenta(int idValorVenta) {
		this.idValorVenta = idValorVenta;
	}

	public int getIdMontoEnLetras() {
		return idMontoEnLetras;
	}

	public void setIdMontoEnLetras(int idMontoEnLetras) {
		this.idMontoEnLetras = idMontoEnLetras;
	}

	public String getValorVenta() {
		return formatNro.format(Double.parseDouble(valorVenta));
	}

	public void setValorVenta(String valorVenta) {
		this.valorVenta = valorVenta;
	}

	public String getIgvVenta() {
		return formatNro.format(Double.parseDouble(igvVenta));
	}

	public void setIgvVenta(String igvVenta) {
		this.igvVenta = igvVenta;
	}

	public String getTotalVenta() {
		return formatNro.format(Double.parseDouble(totalVenta));
	}

	public void setTotalVenta(String totalVenta) {
		this.totalVenta = totalVenta;
	}

	public String getDescuentoVenta() {
		return formatNro.format(Double.parseDouble(descuentoVenta));
	}

	public void setDescuentoVenta(String descuentoVenta) {
		this.descuentoVenta = descuentoVenta;
	}

	public String getMontoLetras() {
		return montoLetras;
	}

	public void setMontoLetras(String montoLetras) {
		this.montoLetras = montoLetras;
	}

	public boolean isGravadas() {
		return gravadas;
	}

	public void setGravadas(boolean gravadas) {
		this.gravadas = gravadas;
	}

	public boolean isExoneradas() {
		return exoneradas;
	}

	public void setExoneradas(boolean exoneradas) {
		this.exoneradas = exoneradas;
	}

	public boolean isGratuitas() {
		return gratuitas;
	}

	public void setGratuitas(boolean gratuitas) {
		this.gratuitas = gratuitas;
	}

	public boolean isDescuentos() {
		return descuentos;
	}

	public void setDescuentos(boolean descuentos) {
		this.descuentos = descuentos;
	}

	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}

	public static int getUltimoId() {
		return ultimoId;
	}

}
