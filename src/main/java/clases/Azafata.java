package clases;

import java.util.Date;

public class Azafata extends Empleado{

	//Atributos
	
	private String _nacionalidad;
	private String _aniosexperiencia;
	private String _idiomas;
	
	//Constructor por defecto
	public Azafata() {
		super();
	}
	
	//Constructor que recibe todos los parametros
	public Azafata(String _dni, String _nombre, String _apellido, String _telefono, String _correoElectronico,
			String _numEmpleado, Date _fechaNombramiento, Departamento _departamento, Cargo _cargo,
			String _nacionalidad, String _aniosexperiencia, String _idiomas) {
		super(_dni, _nombre, _apellido, _telefono, _correoElectronico, _numEmpleado, _fechaNombramiento, _departamento,
				_cargo);
		this._nacionalidad = _nacionalidad;
		this._aniosexperiencia = _aniosexperiencia;
		this._idiomas = _idiomas;
	}


	
	//sett y gett
	public String get_nacionalidad() {
		return _nacionalidad;
	}

	public void set_nacionalidad(String _nacionalidad) {
		this._nacionalidad = _nacionalidad;
	}

	public String get_aniosexperiencia() {
		return _aniosexperiencia;
	}

	public void set_aniosexperiencia(String _aniosexperiencia) {
		this._aniosexperiencia = _aniosexperiencia;
	}

	public String get_idiomas() {
		return _idiomas;
	}

	public void set_idiomas(String _idiomas) {
		this._idiomas = _idiomas;
	}

	//To String
	@Override
	public String toString() {
		return super.toString()+"\nNacionalidad: " + _nacionalidad + "\nAnios de Experiencia: " + _aniosexperiencia + 
				"\nIdiomas: " + _idiomas ;
	}

	
	
	
}
