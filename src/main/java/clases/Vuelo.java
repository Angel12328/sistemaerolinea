package clases;


import java.io.Serializable;
import java.util.Date;

import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;

public class Vuelo implements Serializable{
	

	//Attributos
	private String _codigoVuelo;
	private String _horaSalida,_horaLlegada;
	private Avion _avion;
	private double _precioVuelo;
	public LinkedList<Pasajero> listPasajerosVuelo=new LinkedList<Pasajero>();
	public LinkedList<Ruta> listRutas=new LinkedList<Ruta>();
	public LinkedList<Piloto> listpilotosVuelo=new LinkedList<Piloto>();
	public LinkedList<Asientos> asientosVuelo=new LinkedList<Asientos>();
        
	private Date _fecha;
	private String _moneda;
	
        //CONTROL DE NUMERO DE ASIENTOS
        public LinkedList<Integer> numAsientos=new LinkedList<Integer>();
        
	//Constructor por defecto

        public Vuelo() {
            super();
        }



        public LinkedList<Asientos> getAsientosVuelo() {
            return asientosVuelo;
        }




	//Constructor que recibe todos los parametros
	public Vuelo(String _codigoVuelo, String _horaSalida, String _horaLlegada, Avion _avion, double _precioVuelo,
			Date _fecha, String _moneda) {
		super();
		this._codigoVuelo = _codigoVuelo;
		this._horaSalida = _horaSalida;
		this._horaLlegada = _horaLlegada;
		this._avion = _avion;
		this._precioVuelo = _precioVuelo;
		this._fecha = (Date) _fecha;
		this._moneda = _moneda;
	}


	//sett y gett
	public String get_codigoVuelo() {
		return _codigoVuelo;
	}

	public void set_codigoVuelo(String _codigoVuelo) {
		this._codigoVuelo = _codigoVuelo;
	}

	public String get_horaSalida() {
		return _horaSalida;
	}

	public void set_horaSalida(String _horaSalida) {
		this._horaSalida = _horaSalida;
	}

	public String get_horaLlegada() {
		return _horaLlegada;
	}

	public void set_horaLlegada(String _horaLlegada) {
		this._horaLlegada = _horaLlegada;
	}

	public Avion get_avion() {
		return _avion;
	}

	public void set_avion(Avion _avion) {
		this._avion = _avion;
	}

	public double get_precioVuelo() {
		return _precioVuelo;
	}

	public void set_precioVuelo(double _precioVuelo) {
		this._precioVuelo = _precioVuelo;
	}

	public LinkedList<Pasajero> getListPasajerosVuelo() {
		return listPasajerosVuelo;
	}

	public void setListPasajerosVuelo(LinkedList<Pasajero> listPasajerosVuelo) {
		this.listPasajerosVuelo = listPasajerosVuelo;
	}

	public LinkedList<Ruta> getListRutas() {
		return listRutas;
	}

	public void setListRutas(LinkedList<Ruta> listRutas) {
		this.listRutas = listRutas;
	}


	public Date get_fecha() {
		return _fecha;
	}

	public void set_fecha(Date _fecha) {
		this._fecha = _fecha;
	}

	public String get_moneda() {
		return _moneda;
	}

	public void set_moneda(String _moneda) {
		this._moneda = _moneda;
	}
        /**
         * ARRAY TABLA ASIENTOS
         */
	public Object[][] getArrayModelAsientos() {
            Object[][] array =new Object[asientosVuelo.size()][3];
            for(int i=0; i<asientosVuelo.size(); i++) {
                     array[i][0]=asientosVuelo.get(i).get_codigoAsiento();
                     array[i][1]=asientosVuelo.get(i).get_numero();
                     array[i][2]=asientosVuelo.get(i).get_categoria();


            }
            return array;

        } 

        /**
         * ARRAY TABLA RUTAS
         * @return 
         */
        public Object[][] getArrayModelRutas() {
               Object[][] array =new Object[this.listRutas.size()][8];
               for(int i=0; i<listRutas.size(); i++) {
                        array[i][0]=listRutas.get(i).get_origen().get_nombre();
                        array[i][1]=listRutas.get(i).get_origen().get_pais();
                        array[i][2]=listRutas.get(i).get_origen().get_ciudad();
                        array[i][3]=listRutas.get(i).get_fechasalida();
                        
                        array[i][4]=listRutas.get(i).get_destino().get_nombre();
                        array[i][5]=listRutas.get(i).get_destino().get_pais();
                        array[i][6]=listRutas.get(i).get_destino().get_ciudad();
                        array[i][7]=listRutas.get(i).get_fechallegada();
                        


               }
               return array;

          }         
        

	/**
         * ARRAY DE TABLA AVION DE VUELO
         */
        public Object[][] getArrayModelAvion(Avion[] infoAv) {
               Object[][] array =new Object[infoAv.length][3];
               for(int i=0; i<infoAv.length; i++) {
                        array[i][0]=infoAv[i].get_codigoAvion();
                        array[i][1]=infoAv[i].get_aerolinea();
                        array[i][2]=Integer.toString(infoAv[i].get_numeroAsientos());
               }
               return array;

          }    
        

	/***
         * ARRAY DE TABLA PASAJEROS DE VUELO
         * @return 
         */
        
        public Object[][] getArrayModelPasajeros() {
               Object[][] array =new Object[listPasajerosVuelo.size()][5];
               for(int i=0; i<listPasajerosVuelo.size(); i++) {
                        array[i][0]=listPasajerosVuelo.get(i).get_codigoPasajero();
                        array[i][1]=listPasajerosVuelo.get(i).get_nombre();
                        array[i][2]=listPasajerosVuelo.get(i).get_apellido();
                        array[i][3]=listPasajerosVuelo.get(i).get_telefono();
                        array[i][4]=listPasajerosVuelo.get(i)._correoElectronico;
                        
               }
               return array;

        } 
        
	
	/**
	 * GESTION DE PASAJERO DE VUELO
	 */
 	
	public int buscarPasajeroVuelo(String _codigoPasajero) {
		int posicion=-1;
		for (int i=0; i<listPasajerosVuelo.size();i++){
			if(listPasajerosVuelo.get(i).get_codigoPasajero().equals(_codigoPasajero)){
				posicion=i;
				break;
				
			}
		}
		return posicion;
	}
	
  	public Pasajero buscarPasajeroObj(String _codPasajero) {
		Pasajero _pasajeroEcontrado =null;
		for(int i=0; i<listPasajerosVuelo.size();i++) {
			if(listPasajerosVuelo.get(i).get_codigoPasajero().equals(_codPasajero)) {
				_pasajeroEcontrado= listPasajerosVuelo.get(i);
				break;
			}
		}
		return _pasajeroEcontrado;
	}
	
	
	public boolean agregarPasajeroVuelo(Pasajero _nuevoPasajero) {
		if(buscarPasajeroVuelo(_nuevoPasajero.get_codigoPasajero())!=-1 && listPasajerosVuelo.size()!=0) {
			return false;
		}else {
			listPasajerosVuelo.add(_nuevoPasajero);
			return true;
		}
	}
	
	public boolean modificarPasajeroVuelo(int _posicion, Pasajero _modPasajero) {
		if(_posicion<0 || _posicion>listPasajerosVuelo.size()) {
			return false;
		}else {
			int segPosPasajero= buscarPasajeroVuelo(_modPasajero.get_codigoPasajero());
			if(segPosPasajero==-1 || segPosPasajero==_posicion) {
				listPasajerosVuelo.set(_posicion, _modPasajero);
			}
			return true;
		}
		
		
	}
	public boolean eliminarPasajeroVuelo(String _codigoPasajero) {
		int posicion=buscarPasajeroVuelo(_codigoPasajero);
		if(posicion==-1) {
			return false;
		}else {
			listPasajerosVuelo.remove(posicion);
			return true;
		}

	}
        
	/**
         
	 * Fecha: 3/12/24
	 * Metodo para buscar PASAJEROS por indice
	 * @param _codIndice
	 * @return objeto en la coleccion
	 */
  	public Pasajero getPasajeroByIndex(int _codIndice) {
            return listPasajerosVuelo.get(_codIndice);
	}
	
	public void imprimirPasajerosVuelo() {
		 System.out.println("--------------Lista de Pasajeros del Vuelo--------------\n");
			for(int i=0; i<listPasajerosVuelo.size(); i++) {
				 System.out.println(listPasajerosVuelo.get(i).toString());
			}
	}
        
        /**
         * GESTION ASIENTOS VUELO
         */
	public int buscarAsiento(String _codigoAsiento) { //string tentativo posiblemente sea tipo Vuelo
		int posicion =-1;
		for(int i=0; i<asientosVuelo.size(); i++) {
			if(asientosVuelo.get(i).get_codigoAsiento().equals(_codigoAsiento)) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}        
        
  	public Asientos buscarAsientoObj(String _codAs) {
  		
		Asientos _asEcontr =null;
		for(int i=0; i<asientosVuelo.size();i++) {
			if(asientosVuelo.get(i).get_codigoAsiento().equals(_codAs)) {
				_asEcontr= asientosVuelo.get(i);
				break;
			}
		}
		return _asEcontr;
	}
        
	public boolean agregarAsiento(Asientos _nuevoAsiento) {
		if(buscarAsiento(_nuevoAsiento.get_codigoAsiento())!=-1 && asientosVuelo.size()!=0) {
			return false;
		}else {
			asientosVuelo.add(_nuevoAsiento);
			return true;
		}
	}
        
	public boolean eliminarAsiento(String _codigoAsiento) {
		int posicion=buscarAsiento(_codigoAsiento);
		if(posicion==-1) {
			return false;
		}else {
			asientosVuelo.remove(posicion);
			return true;
		}
	}
        
	/**
	 * GESTION DE RUTA VUELO
	 */
	
	public int buscarRuta(String _codigoRuta) { //string tentativo posiblemente sea tipo Vuelo
		int posicion =-1;
		for(int i=0; i<listRutas.size(); i++) {
			if(listRutas.get(i).get_codigo().equals(_codigoRuta)) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
  	public Ruta buscarRutaObj(String _codRuta) {
  		
		Ruta _RutaEcontr =null;
		for(int i=0; i<listRutas.size();i++) {
			if(listRutas.get(i).get_codigo().equals(_codRuta)) {
				_RutaEcontr= listRutas.get(i);
				break;
			}
		}
		return _RutaEcontr;
	}
  	
	public boolean agregarRuta(Ruta _nuevoRuta) {
		if(buscarRuta(_nuevoRuta.get_codigo())!=-1 && listRutas.size()!=0) {
			return false;
		}else {
			listRutas.add(_nuevoRuta);
			return true;
		}
	}
	
	public boolean modificarRuta(int _posicion, Ruta _modRuta) {
		if(_posicion<0 || _posicion>listRutas.size()) {
			return false;
		}else {
			int segPosVuelo= buscarRuta(_modRuta.get_codigo());
			if(segPosVuelo==-1 || segPosVuelo==_posicion) {
				listRutas.set(_posicion, _modRuta);
			}
			return true;
		}
		
	}
	
	public boolean eliminarRuta(String _codigoRuta) {
		int posicion=buscarRuta(_codigoRuta);
		if(posicion==-1) {
			return false;
		}else {
			listRutas.remove(posicion);
			return true;
		}
	}
        
	/**
         
	 * Fecha: 3/12/24
	 * Metodo para buscar RUTA por indice
	 * @param _codIndice
	 * @return objeto en la coleccion
	 */
  	public Ruta getRutaByIndex(int _codIndice) {
            return listRutas.get(_codIndice);
	}
        
	/**
         
	 * Fecha: 3/12/24
	 * Metodo para elimina RUTA por indice
	 * @param _Indice
	 * @return objeto en la coleccion
	 */        
        public boolean eliminarRutaPorIndice(int _indice){
            listRutas.remove(_indice);
            return true;
        }        
	
	/**
	 * GESTION PILOTOS DEL VUELO
	 */
	
	public int buscarPiloto(String _numEmpl) { //string tentativo posiblemente sea tipo Vuelo
		int posicion =-1;
		for(int i=0; i<listpilotosVuelo.size(); i++) {
			if(listpilotosVuelo.get(i).get_numEmpleado().equals(_numEmpl)) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
  	public Piloto buscarPilotVueloObj(String _numEmpl) {
  		
		Piloto _PilotoEcontr =null;
		for(int i=0; i<listRutas.size();i++) {
			if(listpilotosVuelo.get(i).get_numEmpleado().equals(_numEmpl)) {
				_PilotoEcontr= listpilotosVuelo.get(i);
				break;
			}
		}
		return _PilotoEcontr;
	}
  	
	public boolean agregarPiloto(Piloto _nuevoPiloto) {
		if(buscarPiloto(_nuevoPiloto.get_numEmpleado())!=-1 && listpilotosVuelo.size()!=0) {
			return false;
		}else {
			listpilotosVuelo.add(_nuevoPiloto);
			return true;
		}
	}
	
	public boolean modificarPiloto(int _posicion, Piloto _modPiloto) {
		if(_posicion<0 || _posicion>listpilotosVuelo.size()) {
			return false;
		}else {
			int segPosVuelo= buscarPiloto(_modPiloto.get_numEmpleado());
			if(segPosVuelo==-1 || segPosVuelo==_posicion) {
				listpilotosVuelo.set(_posicion, _modPiloto);
			}
			return true;
		}
			
	}
	
	public boolean eliminarPiloto(String _codigoPiloto) {
		int posicion=buscarPiloto(_codigoPiloto);
		if(posicion==-1) {
			return false;
		}else {
			listpilotosVuelo.remove(posicion);
			return true;
		}
	}
        /*COMBOX ASIENTOS*/

        //CATEGORIA ASIENTO
        public DefaultComboBoxModel getCboCategoriaAsntoModel(){
            LinkedList<String> TipoAsiento=new LinkedList<String>();
            TipoAsiento.add("Basic");
            TipoAsiento.add("Flex");
            TipoAsiento.add("Classic");
            DefaultComboBoxModel model=new DefaultComboBoxModel();
            for(int i=0; i<TipoAsiento.size(); i++){
                model.addElement(TipoAsiento.get(i));
            }
            return model;
        }
        
        //NUMERO ASIENTO
        public DefaultComboBoxModel getCboNumeroAsntoModel(){
            
            
            for(int i=0; i<_avion.get_numeroAsientos(); i++){
                numAsientos.add(i+1);
            }
            //mostrarAsientosDisponibles(numAsientos);
            DefaultComboBoxModel model=new DefaultComboBoxModel();
            for(int i=0; i<numAsientos.size(); i++){
                model.addElement(numAsientos.get(i));
            }
            return model;
        }
        //MOSTRAR LOS NUMERO DE ASIENTOS DISPONIBLES AL CLIENTE

        public void mostrarAsientosDisponibles(LinkedList<Integer> lista){
            if(asientosVuelo.size()>0){
                for(int i=0; i<asientosVuelo.size(); i++) {
                    lista.remove(asientosVuelo.get(i).get_numero());
                }
            }
        }
        
        public String getTipoAsientoByIndex(int _indice){
            LinkedList<String> TipoAsiento=new LinkedList<String>();
            TipoAsiento.add("Basic");
            TipoAsiento.add("Flex");
            TipoAsiento.add("Classic");
            return TipoAsiento.get(_indice);
         
         }
        
        public int getNumAsientoByIndex(int _indice){
            return numAsientos.get(_indice);
         
         }
        
  	public Asientos getAsientoByIndex(int _codIndice) {
            return asientosVuelo.get(_codIndice);
	}
        
        public boolean eliminarAsientoPorIndice(int _indice){
            asientosVuelo.remove(_indice);
            return true;
        }
        

	//toString
	@Override
	public String toString() {
		return "Vuelo [_codigoVuelo=" + _codigoVuelo + ", _horaSalida=" + _horaSalida + ", _horaLlegada=" + _horaLlegada
				+ ", _avion=" + _avion + ", _precioVuelo=" + _precioVuelo + ", listPasajerosVuelo=" + listPasajerosVuelo
				+ ", listRutas=" + listRutas + ", listpilotosVuelo=" + listpilotosVuelo + ", _fecha=" + _fecha
				+ ", _moneda=" + _moneda + "]";
	}
	

	
	

}
