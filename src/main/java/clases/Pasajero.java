package clases;

public  class Pasajero extends Persona {
	
	
	private String _codigoPasajero;
	private String _descripcionPasajero;
	
	public static double _tNino=0.05;
	public static double _tTercEd=0.15;
	

	public Pasajero() {
		super();
	}

	
	public Pasajero(String _dni, String _nombre, String _apellido, String _telefono, String _correoElectronico,
			String _codigoPasajero,String _descripcionPasajero) {
		super(_dni, _nombre, _apellido, _telefono, _correoElectronico);
		this._codigoPasajero = _codigoPasajero;
		this._descripcionPasajero=_descripcionPasajero;
		
	}


	//sett y gett
	public String get_codigoPasajero() {
		return _codigoPasajero;
	}


	public void set_codigoPasajero(String _codigoPasajero) {
		this._codigoPasajero = _codigoPasajero;
	}


	@Override
	public String toString() {
		return "\nid-Pasajero: " + _codigoPasajero +super.toString()+"\nDescripcion: "+_descripcionPasajero;
	}


	public String get_descripcionPasajero() {
		return _descripcionPasajero;
	}


	public void set_descripcionPasajero(String _descripcionPasajero) {
		this._descripcionPasajero = _descripcionPasajero;
	}

	


	
	

}
