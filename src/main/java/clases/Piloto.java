package clases;


import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;

public class Piloto extends Empleado implements Serializable{
	private String _idPiloto;
	private String _nacionalidad;
	private int _aniosExperiencia;
	private double _horasAcumuladas;
	private String _rango;
	private String _licencia;
	private String _estado;
	public LinkedList<Vuelo> vuelosAsignados=new LinkedList<Vuelo>();
	public LinkedList<String> certificaciones=new LinkedList<String>();



        //Constructor por defecto
	public Piloto() {
		super();
	}


        //Constructor que recibe todos los parametros
	public Piloto(String _dni, String _nombre, String _apellido, String _telefono, String _correoElectronico,
			String _numEmpleado, Date _fechaNombramiento, Departamento _departamento, Cargo _cargo, String _idPiloto,
			String _nacionalidad, int _aniosExperiencia, double _horasAcumuladas, String _rango, String _licencia,
			String _estado) {
		super(_dni, _nombre, _apellido, _telefono, _correoElectronico, _numEmpleado, _fechaNombramiento, _departamento,
				_cargo);
		this._idPiloto = _idPiloto;
		this._nacionalidad = _nacionalidad;
		this._aniosExperiencia = _aniosExperiencia;
		this._horasAcumuladas = _horasAcumuladas;
		this._rango = _rango;
		this._licencia = _licencia;
		this._estado = _estado;
	}


        //sett y gett
	public String get_idPiloto() {
		return _idPiloto;
	}


	public void set_idPiloto(String _idPiloto) {
		this._idPiloto = _idPiloto;
	}

	
	public String get_nacionalidad() {
		return _nacionalidad;
	}


	public void set_nacionalidad(String _nacionalidad) {
		this._nacionalidad = _nacionalidad;
	}


	public int get_aniosExperiencia() {
		return _aniosExperiencia;
	}


	public void set_aniosExperiencia(int _aniosExperiencia) {
		this._aniosExperiencia = _aniosExperiencia;
	}


	public double get_horasAcumuladas() {
		return _horasAcumuladas;
	}


	public void set_horasAcumuladas(double _horasAcumuladas) {
		this._horasAcumuladas = _horasAcumuladas;
	}


	public String get_rango() {
		return _rango;
	}


	public void set_rango(String _rango) {
		this._rango = _rango;
	}


	public String get_licencia() {
		return _licencia;
	}


	public void set_licencia(String _licencia) {
		this._licencia = _licencia;
	}


	public String get_estado() {
		return _estado;
	}


	public void set_estado(String _estado) {
		this._estado = _estado;
	}


	public LinkedList<Vuelo> getVuelosAsignados() {
		return vuelosAsignados;
	}


	public void setVuelosAsignados(LinkedList<Vuelo> vuelosAsignados) {
		this.vuelosAsignados = vuelosAsignados;
	}


	public LinkedList<String> getCertificaciones() {
		return certificaciones;
	}


	public void setCertificaciones(LinkedList<String> certificaciones) {
		this.certificaciones = certificaciones;
	}

	
        //to string
	@Override
	public String toString() {
		return super.toString()+"Piloto [_idPiloto=" + _idPiloto + ", _nacionalidad=" + _nacionalidad + ", _aniosExperiencia="
				+ _aniosExperiencia + ", _horasAcumuladas=" + _horasAcumuladas + ", _rango=" + _rango + ", _licencia="
				+ _licencia + ", _estado=" + _estado + ", vuelosAsignados=" + vuelosAsignados + ", certificaciones="
				+ certificaciones + "]";
	}


	public int buscarVueloPiloto(String _codVuelo) { 
		int posicion =-1;
		for(int i=0; i<vuelosAsignados.size(); i++) {
			if(vuelosAsignados.get(i).get_codigoVuelo().equals(_codVuelo)) {
				posicion=i;
				break;
			}
		}
		return posicion;
		
	}
	
	public int buscarCertPiloto(String _certificado) { 
		int posicion =-1;
		for(int i=0; i<certificaciones.size(); i++) {
			if(certificaciones.get(i).equals(_certificado)) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
	
	
}
