package Gestiones;

import java.util.LinkedList;

import clases.InfoPago;
import clases.PagoEfectivo;
import clases.PagoTarjeta;
import java.io.Serializable;


public class GestionPagos implements Serializable {
	private LinkedList<InfoPago> listPagos = new LinkedList<InfoPago>();

	public GestionPagos() {
		super();
	}
	
	public int buscarPago(String _codigoPago) { 
		int posicion =-1;
		for(int i=0; i<listPagos.size(); i++) {
			if(listPagos.get(i).get_codPago().equals(_codigoPago)) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
  	public PagoEfectivo  buscarPagoEfectivoObj(String _codPagoEfectivo) {
  		
		PagoEfectivo _PagoEcontrado =null;
		for(int i=0; i<listPagos.size();i++) {
			if(listPagos.get(i).get_codPago().equals( _codPagoEfectivo)) {
				_PagoEcontrado= (PagoEfectivo) listPagos.get(i);
				break;
			}
		}
		return _PagoEcontrado;
	}
  	
  	public PagoTarjeta  buscarPagoTarjetaObj(String _codPagoEfectivo) {
  		
		PagoTarjeta _PagoEcontrado =null;
		for(int i=0; i<listPagos.size();i++) {
			if(listPagos.get(i).get_codPago().equals( _codPagoEfectivo)) {
				_PagoEcontrado= (PagoTarjeta) listPagos.get(i);
				break;
			}
		}
		return _PagoEcontrado;
	}
  	
	public boolean agregarPagoEfectivo( PagoEfectivo _nuevoPago) {
		if(buscarPago(_nuevoPago.get_codPago())!=-1 && listPagos.size()!=0) {
			return false;
		}else {
			listPagos.add(_nuevoPago);
			return true;
		}
	}
	
	public boolean agregarPagoTarjeta( PagoTarjeta _nuevoPago) {
		if(buscarPago(_nuevoPago.get_codPago())!=-1 && listPagos.size()!=0) {
			return false;
		}else {
			listPagos.add(_nuevoPago);
			return true;
		}
	}
	
	
	
}
