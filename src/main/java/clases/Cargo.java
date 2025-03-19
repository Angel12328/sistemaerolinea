package clases;

import java.io.Serializable;

public class Cargo implements Serializable{
	//Atributos
	private int _codigo;
	private String _descripcioncargo;
	
	//Constructor por defecto (Sin parametros)
	
	public Cargo() {
		super();
	}

	//Constructor con parametros
	public Cargo(int _codigo, String _descripcioncargo) {
		super();
		this._codigo = _codigo;
		this._descripcioncargo = _descripcioncargo;
	}


	//sett y gett
	public int get_codigo() {
		return _codigo;
	}

	public void set_codigo(int _codigo) {
                   
          this._codigo = _codigo;
                    
		
	}

	public String get_descripcioncargo() {
		return _descripcioncargo;
	}

	public void set_descripcioncargo(String _descripcioncargo) {
                if(_descripcioncargo==null || _descripcioncargo.equals("")){
                        throw new IllegalArgumentException(" Descripcion del Cargo es un campo obligatorio");
                    }else{
                        this._descripcioncargo = _descripcioncargo;
                    }
		
	}
	
	//To String
	@Override
	public String toString() {
		return "\nCodigo de cargo: " + _codigo + "\nDescripcion de cargo: " + _descripcioncargo ;
	}
}
