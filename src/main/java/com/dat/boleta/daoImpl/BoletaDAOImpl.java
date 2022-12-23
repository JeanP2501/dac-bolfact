package com.dat.boleta.daoImpl;

import org.springframework.stereotype.Repository;

import com.dat.boleta.dao.BoletaDAO;
import com.dat.boleta.dto.BoletaDTO;
import com.dat.boleta.dto.DocumentoDTO;
import com.dat.boleta.dto.EmisorDTO;
import com.dat.boleta.dto.ProductoDTO;
import com.dat.boleta.dto.ReceptorDTO;

@Repository
public class BoletaDAOImpl implements BoletaDAO {

	@Override
	public BoletaDTO obtenerBoleta() {
		
		DocumentoDTO doc1 = new DocumentoDTO();
		doc1.setTipo("03");
		doc1.setIdMontoEnLetras(1000);
		doc1.setDescuentoVenta(0);
		doc1.setGravadas(true);
		doc1.setExoneradas(false);
		doc1.setGratuitas(false);
		doc1.setDescuentos(false);
		
		EmisorDTO em2 = new EmisorDTO();
		em2.setEmpresaId(3);
		em2.setRuc("20600507371");
		em2.setNombreLegal("CLINICA PARA EL TRABAJADOR DANIEL ALCIDES CARRION S.A.C.");
		em2.setNombreComercial("-");
		em2.setDireccion("CAL.JOSE GOMEZ NRO. 67");
		em2.setUrbanizacion("PABLO VI");
		em2.setDepartamento("AREQUIPA");
		em2.setProvincia("AREQUIPA");
		em2.setDistrito("AREQUIPA");
		em2.setFirmaId("SignatureCTrabajadorDAC");
		
		ProductoDTO prod1 = new ProductoDTO();
		prod1.setCantidad(5);
		prod1.setValorUnitario(44.70);
		prod1.setPrecioUnitario(52.75);
		prod1.setUnidadMedida("NIU");
		prod1.setCodigo("3742");
		prod1.setTipoImpuesto("10");
		
		ProductoDTO prod2 = new ProductoDTO();
		prod2.setCantidad(4);
		prod2.setValorUnitario(13.80);
		prod2.setPrecioUnitario(16.28);
		prod2.setUnidadMedida("NIU");
		prod2.setCodigo("2036");
		prod2.setTipoImpuesto("10");
		
		ProductoDTO prod3 = new ProductoDTO();
		prod3.setCantidad(7);
		prod3.setValorUnitario(19.65);
		prod3.setPrecioUnitario(23.19);
		prod3.setUnidadMedida("NIU");
		prod3.setCodigo("1349");
		prod3.setTipoImpuesto("10");
		
		ReceptorDTO rcp1 = new ReceptorDTO();
		rcp1.setTipoComprobante("03");
		rcp1.setTipoDocumento("1");
		rcp1.setNroDocumento("12345678");
		rcp1.setNombre("JUAN PEREZ");
		
		BoletaDTO boleta1 = new BoletaDTO(doc1, em2, rcp1);	
		boleta1.addProducto(prod1);
		boleta1.addProducto(prod2);
		boleta1.addProducto(prod3);
		
		return boleta1;
		
	}

}
