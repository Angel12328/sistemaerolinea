package Gestiones;

import java.util.LinkedList;

import clases.Ruta;
import java.io.Serializable;



public class GestionRuta implements Serializable{
	private LinkedList<Ruta> listarutas=new LinkedList<Ruta>();

	//Constructor por defecto
	public GestionRuta() {
		super();
	}

	// sett y gett
	public LinkedList<Ruta> getListarutas() {
		return listarutas;
	}

	public void setListarutas(LinkedList<Ruta> listarutas) {
		this.listarutas = listarutas;
	}
	
	/**
	 * Autor: Allan Manuel Orellana
	 * fecha: 27/10/24
	 * Metodo para buscar Ruta
	 * @param _codigoruta a buscar 
	 * @return -1 si no lo encuentra, caso contrario retorna la posicion en la coleccion
	 */
	
	public int buscarRuta(String _codigoruta) { 
		int posicion =-1;
		for(int i=0; i<listarutas.size(); i++) {
			if(listarutas.get(i).get_codigo().equals(_codigoruta)) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
	/**
	 * Autor: Allan Manuel Orellana
	 * fecha: 27/10/24
	 * Metodo para buscar Ruta
	 * @param _codigoruta a buscar 
	 * @return el objeto en la coleccion
	 */
	public Ruta buscarRutaObj(String _codigoruta) {
  		
		Ruta _RutaEncontrada =null;
		for(int i=0; i<listarutas.size();i++) {
			if(listarutas.get(i).get_codigo().equals(_codigoruta)) {
				_RutaEncontrada= listarutas.get(i);
				break;
			}
		}
		return _RutaEncontrada;
	}
	
	/**Autor: Allan Manuel Orellana
	 * fecha: 27/10/24
	 * Metodo para agregar Ruta
	 * 
	 * @param _nuevaRuta a agregar
	 * @return true si se realizo correctamente, caso contrario retorna false
	 */
	public boolean agregarRuta(Ruta _nuevaRuta) {
		if(buscarRuta(_nuevaRuta.get_codigo())!=-1 && listarutas.size()!=0) {
			return false;
		}else {
			listarutas.add(_nuevaRuta);
			return true;
		}
	}
	
	/**Autor: Allan Manuel Orellana
	 * fecha: 27/10/24
	 * Metodo para Modificar ruta
	 * @param _posicion o indice en la coleccion
	 * @param _modRuta nuevo objeto a agregar
	 * @return true si se realizo correctamente, caso contrario retorna false
	 */
	
	public boolean modificarRuta(int _posicion, Ruta _modRuta) {
		if(_posicion<0 || _posicion>listarutas.size()) {
			return false;
		}else {
			int segPosRuta= buscarRuta(_modRuta.get_codigo());
			if(segPosRuta==-1 || segPosRuta==_posicion) {
				listarutas.set(_posicion, _modRuta);
			}
			return true;
		}
		
		
	}
	
	/**Autor: Allan Manuel Orellana
	 * fecha: 27/10/24
	 * Metodo para elimiar Ruta
	 * 
	 * @param _codigoRuta a eliminar
	 * @return true si se realizo correctamente, caso contrario retorna false
	 */
	public boolean eliminarRuta(String _codigoRuta) {
		int posicion=buscarRuta(_codigoRuta);
		if(posicion==-1) {
			return false;
		}else {
			listarutas.remove(posicion);
			return true;
		}
	}
        
        public boolean eliminarRutaCache(){
            listarutas.clear();
            return true;
        }
	
        public boolean eliminarPorIndice(int _indice){
            listarutas.remove(_indice);
            return true;
        }
	//Metodo para Imprimir la lista
	 public void imprimirRuta() {
		 System.out.println("--------------Rutas Disponibles--------------\n");
		
		 
		for(int i=0; i<listarutas.size(); i++) {
			 System.out.println(listarutas.get(i).toString());
		}
		
	 }
         
         public Ruta getRutaByIndex(int _posicion){
             return listarutas.get(_posicion);
         }
         
         public boolean eliminarRutaPorIndice(int _indice){
             listarutas.remove(_indice);
             return true;
         }
         
         
         
          public Object[][] getArrayGestion() {
		 
		 /*     private String _codigo;
                        private Aeropuerto _origen;
                        private Aeropuerto _destino;
                        private Date _fechasalida;
                        private Date _fechallegada; */
		
                  
		 Object [][] array = new Object[this.listarutas.size()][5];
                    for(int i=0; i<listarutas.size(); i++) {
			 array[i][0]=listarutas.get(i).get_codigo();
                         array[i][1]=listarutas.get(i).get_origen().get_nombre()+" "+listarutas.get(i).get_origen().get_pais();
                         array[i][2]=listarutas.get(i).get_destino().get_nombre()+" "+listarutas.get(i).get_destino().get_pais();
                         array[i][3]=listarutas.get(i).get_fechasalida();
                         array[i][4]=listarutas.get(i).get_fechallegada();
                         
                    } 
		return  array;
	 }
          
	public void eliminarRutas() {
            listarutas.remove();
            
	}          
          
        public Object[][] getArrayModel() {
           Object[][] array =new Object[this.listarutas.size()][10];
           //String[] titulos={"Aropuerto Origen","Pais Origen","Ciudad Origen","Fecha Salida","Hora Salida","Aropuerto Destino","Pais Destino","Ciudad Destino","Fecha Llegada","Hora Llegada"};
           for(int i=0; i<listarutas.size(); i++) {
                    array[i][0]=listarutas.get(i).get_origen().get_nombre();
                    array[i][1]=listarutas.get(i).get_origen().get_pais();
                    array[i][2]=listarutas.get(i).get_origen().get_ciudad();
                    array[i][3]=listarutas.get(i).get_fechasalida();
                    
                    array[i][4]=listarutas.get(i).get_destino().get_nombre();
                    array[i][5]=listarutas.get(i).get_destino().get_pais();
                    array[i][6]=listarutas.get(i).get_destino().get_ciudad();
                    array[i][7]=listarutas.get(i).get_fechallegada();
                    


           }
           return array;

        }    
}
