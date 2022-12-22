package com.dat.boleta.dto;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class BoletaDTO {
	
	private final Double IGV_PORCENTAJE = 18.00;
	private final String MONEDA = "PEN";
	//private String Moneda02 ;
	private DocumentoDTO documento;
	private EmisorDTO emisor;
	private ReceptorDTO receptor;
	private List<ProductoDTO> productos;
	
	public BoletaDTO() {
		this.productos = new ArrayList<>();
	}
	
	public BoletaDTO(DocumentoDTO documento, EmisorDTO emisor, ReceptorDTO receptor) {
		this();
		this.documento = documento;
		this.emisor = emisor;
		this.receptor = receptor;
		//this.productos = productos;
	}
	
	DecimalFormat formatNro = new DecimalFormat("0.00");
	
	public Double getIgvPorcentaje() {
		return IGV_PORCENTAJE;
	}
	public String getMoneda() {
		return MONEDA;
	}
	public DocumentoDTO getDocumento() {
		return documento;
	}
	public void setDocumento(DocumentoDTO documento) {
		this.documento = documento;
	}
	public EmisorDTO getEmisor() {
		return emisor;
	}
	public void setEmisor(EmisorDTO emisor) {
		this.emisor = emisor;
	}
	public ReceptorDTO getReceptor() {
		return receptor;
	}
	public void setReceptor(ReceptorDTO receptor) {
		this.receptor = receptor;
	}	
	public List<ProductoDTO> getProductos() {
		return productos;
	}
	public void setProductos(List<ProductoDTO> productos) {
		this.productos = productos;
	}

	public void addProducto(ProductoDTO producto) {
		if(this.productos!=null) {
			this.productos.add(producto);			
		}		
	}
	
	@Override
	public String toString() {
		return "Boleta Detalle: " + "\nBoleta = " + documento + ", \nEmisor = " + emisor + ", \nReceptor = " + receptor +
				", \nProductos = " + this.productos + "IGV : " + this.IGV_PORCENTAJE + "Moneda : " + this.MONEDA;
	}

}
