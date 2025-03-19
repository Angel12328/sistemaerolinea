package clases;

import java.util.Date;
import java.util.LinkedList;

public class Factura {
	
	
	private String _codigo;
	private Cliente _cliente;
	private LinkedList<Boleto> lstBoletos= new LinkedList<Boleto>();
	private double _monto;
	private String _estado;
	private String _moneda;
	private Date _fecha;
	private Date _hora;
	

	public Factura() {
		super();
	}


	public Factura(String _codigo, Cliente _cliente, double _monto, String _estado, String _moneda, Date _fecha,
			Date _hora) {
		super();
		this._codigo = _codigo;
		this._cliente = _cliente;
		this._monto = _monto;
		this._estado = _estado;
		this._moneda = _moneda;
		this._fecha = _fecha;
		this._hora = _hora;
	}


	public String get_codigo() {
		return _codigo;
	}


	public void set_codigo(String _codigo) {
		this._codigo = _codigo;
	}


	public Cliente get_cliente() {
		return _cliente;
	}


	public void set_cliente(Cliente _cliente) {
		this._cliente = _cliente;
	}


	public LinkedList<Boleto> getLstBoletos() {
		return lstBoletos;
	}


	public void setLstBoletos(LinkedList<Boleto> lstBoletos) {
		this.lstBoletos = lstBoletos;
	}


	public double get_monto() {
		return _monto;
	}


	public void set_monto(double _monto) {
		this._monto = _monto;
	}


	public String get_estado() {
		return _estado;
	}


	public void set_estado(String _estado) {
		this._estado = _estado;
	}


	public String get_moneda() {
		return _moneda;
	}


	public void set_moneda(String _moneda) {
		this._moneda = _moneda;
	}


	public Date get_fecha() {
		return _fecha;
	}


	public void set_fecha(Date _fecha) {
		this._fecha = _fecha;
	}


	public Date get_hora() {
		return _hora;
	}


	public void set_hora(Date _hora) {
		this._hora = _hora;
	}

	/*GESTION INTERNA DE LOS BOLETOS COMPRADOS*/

	public int buscarBoleto(String _codigoBoleto) { //string tentativo posiblemente sea tipo Vuelo
		int posicion =-1;
		for(int i=0; i<lstBoletos.size(); i++) {
			if(lstBoletos.get(i)._codigoBoleto.equals(_codigoBoleto)) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
  	public Boleto buscarBoletoObj(String _codBoleto) {
  		
		Boleto _BoletoEc =null;
		for(int i=0; i<lstBoletos.size();i++) {
			if(lstBoletos.get(i)._codigoBoleto.equals(_codBoleto)) {
				_BoletoEc= lstBoletos.get(i);
				break;
			}
		}
		return _BoletoEc;
	}
	
	public boolean agregarBoleto(Boleto _nuevoBoleto) {
		if(buscarBoleto(_nuevoBoleto._codigoBoleto)!=-1 && lstBoletos.size()!=0) {
			return false;
		}else {
			lstBoletos.add(_nuevoBoleto);
			return true;
		}
	}
	
	public boolean modificarBoleto(int _posicion, Boleto _modBoleto) {
		if(_posicion<0 || _posicion>lstBoletos.size()) {
			return false;
		}else {
			int segPosVuelo= buscarBoleto(_modBoleto._codigoBoleto);
			if(segPosVuelo==-1 || segPosVuelo==_posicion) {
				lstBoletos.set(_posicion, _modBoleto);
			}
			return true;
		}	
	}
	
	public boolean eliminarBoleto(String _codigoBoleto) {
		int posicion=buscarBoleto(_codigoBoleto);
		if(posicion==-1) {
			return false;
		}else {
			lstBoletos.remove(posicion);
			return true;
		}
	}
	
	
}
