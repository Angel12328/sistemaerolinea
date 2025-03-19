package clases;

//import java.util.LinkedList;

import java.io.Serializable;


public class Asientos implements Serializable{
		
	//Atributos
	private String _codigoAsiento;
	private int _numero;
	private String _categoria;
        private String _estado;
	
        //private String _estado;
	
	//Constructor por defecto
	public Asientos() {
		super();
	}
	
	//Constructor que recibe todoso los parametros
	public Asientos(String _codigoAsiento, int _numero, String _categoria, Avion _avion,String _estado) {
		super();
		this._codigoAsiento = _codigoAsiento;
		this._numero = _numero;
		this._categoria = _categoria;
                this._estado=_estado;
		
	}
        
	public String getEstado() {
		return _estado;
	}

    //sett y gett
    public void setEstado(String _estado) {
        this._estado = _estado;
    }

    public String get_codigoAsiento() {
        return _codigoAsiento;
    }
	public void set_codigoAsiento(String _codigoAsiento) {
		this._codigoAsiento = _codigoAsiento;
	}
	public int get_numero() {
		return _numero;
	}
	public void set_numero(int _numero) {
		this._numero = _numero;
	}
	public String get_categoria() {
		return _categoria;
	}
	public void set_categoria(String _categoria) {
		this._categoria = _categoria;
	}

        
        
	//toString
	@Override
	public String toString() {
		return "\nCodigo de Asiento: " + _codigoAsiento + "\nNumero: " + _numero + "\nCategoria: " + _categoria + "\nestado: " + _estado;
	}
	
	
	
	
		
}
