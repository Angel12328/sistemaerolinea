package clases;

public class Boleto {
	
	//Atributos
	String _codigoBoleto;
	private Cliente _cliente;
	private Pasajero _pasajero;
	private Asientos _asiento;
	private Vuelo _vuelo;
	
	
	//Constructor por defecto
	public Boleto() {
		super();
	}

	//Constructor que recibe todos los parametros
	public Boleto(String _codigoBoleto, Cliente _cliente, Pasajero _pasajero, Asientos _asiento, Vuelo _vuelo) {
		super();
		this._codigoBoleto = _codigoBoleto;
		this._cliente = _cliente;
		this._pasajero = _pasajero;
		this._asiento = _asiento;
		this._vuelo = _vuelo;
	}

	//sett y gett
	public String get_codigoBoleto() {
		return _codigoBoleto;
	}


	public void set_codigoBoleto(String _codigoBoleto) {
		this._codigoBoleto = _codigoBoleto;
	}


	public Cliente get_cliente() {
		return _cliente;
	}


	public void set_cliente(Cliente _cliente) {
		this._cliente = _cliente;
	}


	public Pasajero get_pasajero() {
		return _pasajero;
	}


	public void set_pasajero(Pasajero _pasajero) {
		this._pasajero = _pasajero;
	}


	public Asientos get_asiento() {
		return _asiento;
	}


	public void set_asiento(Asientos _asiento) {
		this._asiento = _asiento;
	}


	public Vuelo get_vuelo() {
		return _vuelo;
	}


	public void set_vuelo(Vuelo _vuelo) {
		this._vuelo = _vuelo;
	}

	
	//toString
	@Override
	public String toString() {
		return "Boleto [_codigoBoleto=" + _codigoBoleto + ", _cliente=" + _cliente + ", _pasajero=" + _pasajero
				+ ", _asiento=" + _asiento + ", _vuelo=" + _vuelo ;
	}
	

	
	/*AGREGAR LAS DEMAS FUNCIONES HASTA TENER UNA INTERFAZ DE USUARIO
	 *PARA ASI EL CLIENTE PUEDA DECIDIR SI ELIMINAR Y O AGREGAR UN VUELO ANTES DE GENERAR EL BOLETO 
	*/
	
	
	

	
	

}
