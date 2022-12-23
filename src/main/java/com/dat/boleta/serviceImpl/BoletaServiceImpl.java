package com.dat.boleta.serviceImpl;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dat.boleta.dao.BoletaDAO;
import com.dat.boleta.dto.BoletaDTO;
import com.dat.boleta.dto.ProductoDTO;
import com.dat.boleta.service.BoletaService;
import com.dat.boleta.utils.FrmtBolFac;
import com.dat.boleta.utils.NroTxt;

@Service
public class BoletaServiceImpl implements BoletaService {

	@Autowired
	private BoletaDAO boletaDAO;
	
	SimpleDateFormat fchFormat = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat hrFormat = new SimpleDateFormat("hh:mm:ss");
	//DecimalFormat nroFormat = new DecimalFormat("0.00");
	
	Date fechaAct = new Date();
	Calendar fchPart = Calendar.getInstance();
	
	@Override
	public BoletaDTO getBoleta() {
		BoletaDTO boleta = boletaDAO.obtenerBoleta(); 
		boleta.getDocumento().setFechaEmision(fchFormat.format(fechaAct));
		boleta.getDocumento().setHoraEmision(hrFormat.format(fechaAct));
		boleta.getDocumento().setSerieNumero(FrmtBolFac.FORMAT_BOL + boleta.getDocumento().getUltimoId());
		boleta.getDocumento().setIdentificador(boleta.getDocumento().getTipo() + "-" + fchPart.get(Calendar.YEAR) + (fchPart.get(Calendar.MONTH)+1) + fchPart.get(Calendar.DATE) + "-" + FrmtBolFac.FORMAT_BOL + boleta.getDocumento().getUltimoId());
		//Calcula el total de venta de los productos
		double total = 0;
		for(ProductoDTO obj : boleta.getProductos()) {
			obj.setIgvProducto(obj.getValorProducto() * boleta.getIgvPorcentaje() / 100);
			total += obj.getValorProducto();
		}
		boleta.getDocumento().setValorVenta((total));
		double igvVentaTotal = ((total * boleta.getIgvPorcentaje()) / 100);
		boleta.getDocumento().setIgvVenta((igvVentaTotal));
		boleta.getDocumento().setTotalVenta((igvVentaTotal + total));
		boleta.getDocumento().setItems(boleta.getProductos().size());
		NroTxt nroTxt = new NroTxt();
		boleta.getDocumento().setMontoLetras(nroTxt.convertir((igvVentaTotal + total)+"", true));		
		return boleta;
	}
	
/*

	@Override
	public double getIgvVentaTotal(List<ProductoDTO> productos, double bolIgv) {
		return Double.parseDouble(nroFormat.format(getTotalValorVenta(productos) * bolIgv / 100));
	}

	@Override
	public double totalValorIGVProd(double totalVta, double IGV) {
		return Double.parseDouble(nroFormat.format(totalVta * (IGV/100)));
	}
*/
}
