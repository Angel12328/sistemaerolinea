package clases;

public class Cliente extends Persona {
	
	//Atributos
	private String _idCliente;

	//Cosntructor por defecto
	public Cliente() {
		super();
	}

	//Constructor que recibe todos los parametros
	public Cliente(String _dni, String _nombre, String _apellido, String _telefono, String _correoElectronico,
			String _idCliente) {
		super(_dni, _nombre, _apellido, _telefono, _correoElectronico);
		this._idCliente = _idCliente;
	}

	//sett y gett
	public String get_idCliente() {
		return _idCliente;
	}

	public void set_idCliente(String _idCliente) {
		this._idCliente = _idCliente;
	}

	//To Striing
	@Override
	public String toString() {
		return "\nid-Cliente: " + _idCliente+super.toString();
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
}
