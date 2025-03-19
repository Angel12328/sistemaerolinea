package Gestiones;

import java.util.LinkedList;

import clases.Boleto;



public class GestionBoleto {
	private LinkedList<Boleto> listBoletos=new LinkedList<Boleto>();
	
	public int buscarBoleto(String _codigoBoleto) { 
		int posicion =-1;
		for(int i=0; i<listBoletos.size(); i++) {
			if(listBoletos.get(i).get_codigoBoleto().equals(_codigoBoleto)) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
  	public Boleto buscarBoletoObj(String _codVBoleto) {
  		
		Boleto _BoletoEcontrado =null;
		for(int i=0; i<listBoletos.size();i++) {
			if(listBoletos.get(i).get_codigoBoleto().equals(_codVBoleto)) {
				_BoletoEcontrado= listBoletos.get(i);
				break;
			}
		}
		return _BoletoEcontrado;
	}
  	
	public boolean agregarBoleto(Boleto _nuevoBoleto) {
		if(buscarBoleto(_nuevoBoleto.get_codigoBoleto())!=-1 && listBoletos.size()!=0) {
			return false;
		}else {
			listBoletos.add(_nuevoBoleto);
			return true;
		}
	}
	
	public boolean modificarBoleto(int _posicion, Boleto _modVuelo) {
		if(_posicion<0 || _posicion>listBoletos.size()) {
			return false;
		}else {
			int segPosVuelo= buscarBoleto(_modVuelo.get_codigoBoleto());
			if(segPosVuelo==-1 || segPosVuelo==_posicion) {
				listBoletos.set(_posicion, _modVuelo);
			}
			return true;
		}	
	}
  	
	public boolean eliminarBoleto(String _codigoBoleto) {
		int posicion=buscarBoleto(_codigoBoleto);
		if(posicion==-1) {
			return false;
		}else {
			listBoletos.remove(posicion);
			return true;
		}
	}
	
}
