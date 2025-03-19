package clases;

import java.io.Serializable;
import java.util.Date;

public abstract class Empleado extends Persona implements Serializable {
	

        //Atributos
	
	private String _numEmpleado;
	private Date _fechaNombramiento;
	private Departamento _departamento;
	private Cargo _cargo;
	
	
	
	
	//Constructor por defecto
	public Empleado() {
		super();
	}

	public Empleado(String _dni, String _nombre, String _apellido, String _telefono, String _correoElectronico) {
		super(_dni, _nombre, _apellido, _telefono, _correoElectronico);
	}

	//Constructor que recibe todos los parametros
	public Empleado(String _dni, String _nombre, String _apellido, String _telefono, String _correoElectronico,
			String _numEmpleado, Date _fechaNombramiento, Departamento _departamento, Cargo _cargo) {
		super(_dni, _nombre, _apellido, _telefono, _correoElectronico);
		this._numEmpleado = _numEmpleado;
		this._fechaNombramiento = _fechaNombramiento;
		this._departamento = _departamento;
		this._cargo = _cargo;
	}


	//Gett y sett
	public String get_numEmpleado() {
		return _numEmpleado;
	}



	public void set_numEmpleado(String _numEmpleado) {
             if(_numEmpleado==null || _numEmpleado.equals("") ){
                        throw new IllegalArgumentException(" Código de empleado es un campo obligatorio");
                    }else{
                        this._numEmpleado = _numEmpleado;
                    }
		
	}


	public Date get_fechaNombramiento() {
		return _fechaNombramiento;
	}


	public void set_fechaNombramiento(Date _fechaNombramiento) {
		this._fechaNombramiento = _fechaNombramiento;
	}



	public Cargo get_cargo() {
		return _cargo;
	}


	public void set_cargo(Cargo _cargo) {
		this._cargo = _cargo;
	}


	public Departamento get_departamento() {
		return _departamento;
	}


	public void set_departamento(Departamento _departamento) {
		this._departamento = _departamento;
	}
	//To String 
	@Override
	public String toString() {
		return "\nNumero Empleado: " + _numEmpleado + super.toString()+ "\nFecha Nombramiento: " + _fechaNombramiento ;
	}


	
	
	
	
	
	
	
}
