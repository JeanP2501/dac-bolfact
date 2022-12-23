package com.dat.boleta.dto;

public class DocumentoDTO {
	
	private String tipo;
	private String fechaEmision;
	private String horaEmision;
	private String serieNumero;
	private String identificador;
	private int idValorVenta;
	private int idMontoEnLetras;
	private double valorVenta;
	private double igvVenta;
	private double totalVenta;
	private double descuentoVenta;
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

	public DocumentoDTO(String tipo, int idMontoEnLetras, double valorVenta, double descuentoVenta,
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

	public double getValorVenta() {
		return valorVenta;
	}

	public void setValorVenta(double valorVenta) {
		this.valorVenta = valorVenta;
	}

	public double getIgvVenta() {
		return igvVenta;
	}

	public void setIgvVenta(double igvVenta) {
		this.igvVenta = igvVenta;
	}

	public double getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(double totalVenta) {
		this.totalVenta = totalVenta;
	}

	public double getDescuentoVenta() {	
		return descuentoVenta;
	}

	public void setDescuentoVenta(double descuentoVenta) {
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
