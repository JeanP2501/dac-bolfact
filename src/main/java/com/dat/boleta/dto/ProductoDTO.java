package com.dat.boleta.dto;

import java.text.DecimalFormat;

public class ProductoDTO {
	
	private int id;
	private int cantidad;
	private String valorUnitario;
	private String precioUnitario;
	private String unidadMedida;
	private String codigo;
	private String descripcion;
	private String tipoImpuesto;
	private String valorProducto;
	private String igvProducto;
	
	private static int ultimoId;
	
	public ProductoDTO() {
		this.id = ++ultimoId;
	}
	
	public ProductoDTO(int cantidad, String valorUnitario, String precioUnitario, String unidadMedida,
			String codigo, String tipoImpuesto) {
		this();
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
		this.precioUnitario = precioUnitario;
		this.unidadMedida = unidadMedida;
		this.codigo = codigo;
		this.tipoImpuesto = tipoImpuesto;
	}
	
	DecimalFormat formatNro = new DecimalFormat("0.00");
	
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
	public String getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = formatNro.format(valorUnitario);
	}
	public String getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = formatNro.format(precioUnitario);
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
	public String getValorProducto() {
		//return valorProducto;
		if(this.cantidad>0 && Double.parseDouble(this.valorUnitario)>0)
			return formatNro.format(this.cantidad * Double.parseDouble(this.valorUnitario));
		else return "";
	}
	public void setValorProducto(double valorProducto) {
		this.valorProducto = formatNro.format(valorProducto);
	}
	public String getIgvProducto() {
		return igvProducto;
	}
	public void setIgvProducto(double igvProducto) {
		this.igvProducto = formatNro.format(igvProducto);
	}
	
	@Override
	public String toString() {
		return "\nProductoDTO [id=" + id + ", cantidad=" + cantidad + ", valorUnitario=" + valorUnitario
				+ ", precioUnitario=" + precioUnitario + ", unidadMedida=" + unidadMedida + ", codigo=" + codigo
				+ ", descripcion=" + descripcion + ", tipoImpuesto=" + tipoImpuesto + ", valorProducto=" + valorProducto
				+ ", igvProducto=" + igvProducto + "]";
	}

}
