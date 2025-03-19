package Gestiones;

import java.util.LinkedList;

import clases.Factura;



public class GestionFactura {
	private LinkedList<Factura> listVuelos=new LinkedList<Factura>();
	
	public int buscarFactura(String _codigoFactura) { 
		int posicion =-1;
		for(int i=0; i<listVuelos.size(); i++) {
			if(listVuelos.get(i).get_codigo().equals(_codigoFactura)) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
  	public Factura buscarFacturaObj(String _codFactura) {
  		
		Factura _FactEcontrado =null;
		for(int i=0; i<listVuelos.size();i++) {
			if(listVuelos.get(i).get_codigo().equals(_codFactura)) {
				_FactEcontrado= listVuelos.get(i);
				break;
			}
		}
		return _FactEcontrado;
	}
  	
	public boolean agregarFactura(Factura _nuevFactura) {
		if(buscarFactura(_nuevFactura.get_codigo())!=-1 && listVuelos.size()!=0) {
			return false;
		}else {
			listVuelos.add(_nuevFactura);
			return true;
		}
	}
  	

	
}

