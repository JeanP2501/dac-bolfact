package com.dat.boleta.dto;

public class ProductoDTO {
	
	private int id;
	private int cantidad;
	private double valorUnitario;
	private double precioUnitario;
	private String unidadMedida;
	private String codigo;
	private String descripcion;
	private String tipoImpuesto;
	private double valorProducto;
	private double igvProducto;
	
	private static int ultimoId;
	
	public ProductoDTO() {
		this.id = ++ultimoId;
	}
	
	public ProductoDTO(int cantidad, double valorUnitario, double precioUnitario, String unidadMedida,
			String codigo, String tipoImpuesto) {
		this();
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
		this.precioUnitario = precioUnitario;
		this.unidadMedida = unidadMedida;
		this.codigo = codigo;
		this.tipoImpuesto = tipoImpuesto;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public String getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return "PRODUCTO CODIGO "+ this.codigo;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipoImpuesto() {
		return tipoImpuesto;
	}
	public void setTipoImpuesto(String tipoImpuesto) {
		this.tipoImpuesto = tipoImpuesto;
	}
	public double getValorProducto() {	
		if(this.cantidad>0 && this.valorUnitario>0)
			return this.cantidad * this.valorUnitario;
		else return 0;
	}
	public void setValorProducto(double valorProducto) {
		this.valorProducto = valorProducto;
	}
	public double getIgvProducto() {
		return igvProducto;
	}
	public void setIgvProducto(double igvProducto) {
		this.igvProducto = igvProducto;
	}
	
	@Override
	public String toString() {
		return "\nProductoDTO [id=" + id + ", cantidad=" + cantidad + ", valorUnitario=" + valorUnitario
				+ ", precioUnitario=" + precioUnitario + ", unidadMedida=" + unidadMedida + ", codigo=" + codigo
				+ ", descripcion=" + descripcion + ", tipoImpuesto=" + tipoImpuesto + ", valorProducto=" + valorProducto
				+ ", igvProducto=" + igvProducto + "]";
	}

}
