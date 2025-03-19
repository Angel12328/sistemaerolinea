package clases;

import java.io.Serializable;

public abstract class Persona implements Serializable{

	//Atributos
	protected String _dni;
	protected String _nombre;
	protected String _apellido;
	protected String _telefono;
	protected String _correoElectronico;
	
	//Constructor por defecto
	public Persona() {
		super();
	}

        //Constructor que recibe todos los parametros
	public Persona(String _dni, String _nombre, String _apellido, String _telefono, String _correoElectronico) {
		super();
		this._dni = _dni;
		this._nombre = _nombre;
		this._apellido = _apellido;
		this._telefono = _telefono;
		this._correoElectronico = _correoElectronico;
	}

        //sett y gett
	public String get_dni() {
		return _dni;
	}

	public void set_dni(String _dni) {
		this._dni = _dni;
	}

	public String get_nombre() {
		return _nombre;
	}

	public void set_nombre(String _nombre) {
             if(_nombre==null || _nombre.equals("") ){
                        throw new IllegalArgumentException(" Nombre es un campo obligatorio");
                    }else{
                       this._nombre = _nombre; 
                    }
		
	}

	public String get_apellido() {
		return _apellido;
	}

	public void set_apellido(String _apellido) {
            if(_apellido==null || _apellido.equals("") ){
                        throw new IllegalArgumentException(" Apellido es un campo obligatorio");
                    }else{
                      this._apellido = _apellido;
                    }
            
		
	}

	public String get_telefono() {
            
		return _telefono;
	}

	public void set_telefono(String _telefono) {
              if(_telefono==null || _telefono.equals("") ){
                        throw new IllegalArgumentException(" Teléfono es un campo obligatorio");
                    }else{
                      this._telefono = _telefono;
                    }
		
	}

	public String get_correoElectronico() {
		return _correoElectronico;
	}

	public void set_correoElectronico(String _correoElectronico) {
                if(!_correoElectronico.contains("@")|| !_correoElectronico.contains(".")){
                    throw new IllegalArgumentException(" Correo elctrónico es incorrecto");
                
                }else{
                    this._correoElectronico = _correoElectronico;
                }
		
	}

        //toString
	@Override
	public String toString() {
		return "\nid-Persona: " + _dni + "\nNombre Completo: " + _nombre + " " + _apellido + "\nTelefono: "
				+ _telefono + "\nCorreo Electronico: " + _correoElectronico ;
	}
	
	
}
