package clases;

import java.io.Serializable;
import java.util.LinkedList;

public class Aeropuerto implements Serializable {

                //Atributos
                private String _codigo;
		private String _nombre;
		private String _pais;
		private String _ciudad;
		
		
		//constructor por defecto
		public Aeropuerto() {

			super();
		}

		//constructor con parametross
		public Aeropuerto(String _codigo, String _nombre, String _pais, String _ciudad) {
			super();
			this._codigo = _codigo;
			this._nombre = _nombre;
			this._pais = _pais;
			this._ciudad = _ciudad;
		}
		
		//sett y gett

		public String get_codigo() {
			return _codigo;
		}

		public void set_codigo(String _codigo) {
                    
                    if(_codigo==null || _codigo.equals("") ){
                        throw new IllegalArgumentException(" Código es un campo obligatorio");
                    }else{
                        this._codigo = _codigo;
                    }
	        
		}

		public String get_nombre() {
			return _nombre;
		}

		public void set_nombre(String _nombre) {
                    if(_nombre==null || _nombre.equals("")){
                        throw new IllegalArgumentException(" Nombre del aeropuerto es un campo obligatorio");
                    }else{
                        this._nombre = _nombre;
                    }
			
		}

		public String get_pais() {
			return _pais;
		}

		public void set_pais(String _pais) {
                    if(_pais==null || _pais.equals("")){
                        throw new IllegalArgumentException(" Debe espesificar el país");
                    }else{
                        this._pais = _pais;
                    }
			
		}

		public String get_ciudad() {
			return _ciudad;
		}

		public void set_ciudad(String _ciudad) {
                    if(_ciudad==null || _ciudad.equals("")){
                        throw new IllegalArgumentException(" Debe espesificar la ciudad");
                    }else{
                        this._ciudad = _ciudad;
                    }
			
		}
		
		//to string
		@Override
		public String toString() {
			return "\nCodigo Aeropuerto: " + _codigo + "\nNombre: " + _nombre + "\nPais: " + _pais + "\nCiudad: " + _ciudad;
					
		}
		
		
}
