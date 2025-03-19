package Gestiones;

import java.util.LinkedList;

import clases.Aeropuerto;
import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;



public class GestionAeropuerto implements Serializable{
	private LinkedList<Aeropuerto> lstAeropuerto= new LinkedList<Aeropuerto>();

	//Constructor por defecto
	public GestionAeropuerto() {
		super();
	}

	//sett y gett
	public LinkedList<Aeropuerto> getLstAeropuerto() {
		return lstAeropuerto;
	}

	public void setLstAeropuerto(LinkedList<Aeropuerto> lstAeropuerto) {
		this.lstAeropuerto = lstAeropuerto;
	}
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para buscar Aeropuerto
	 * @param _codigoAeropuerto a buscar
	 * @return -1 si no lo encuentra, caso contrario retorna la posicion en la coleccion
	 */
	public int buscarAeropuerto(String _codigoAeropuerto) { 
		int posicion =-1;
		for(int i=0; i<lstAeropuerto.size(); i++) {
			if(lstAeropuerto.get(i).get_codigo().equals(_codigoAeropuerto)) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para buscar Aeropuerto
	 * @param _codigoAeropuerto a buscar
	 * @return  retorna el objeto en la coleccion
	 */
	public Aeropuerto buscarAeroObj(String _codigoAeropuerto) {
  		
		Aeropuerto _AeroEcontrado =null;
		for(int i=0; i<lstAeropuerto.size();i++) {
			if(lstAeropuerto.get(i).get_codigo().equals(_codigoAeropuerto)) {
				_AeroEcontrado= lstAeropuerto.get(i);
				break;
			}
		}
		return _AeroEcontrado;
	}
	
        /**Autor:Allan Manuel Orellana
	 * Fecha: 28/11/24
         * Metodo para buscar por indice
         * @param indice de Aeropuerto a buscar
         * @return indice en la lista
         */
        public Aeropuerto getAeroByIndex(int indice){
            return lstAeropuerto.get(indice);
        }
        
        
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para agregar Aeropuerto 
	 * @param _nuevoAero objeto a agregar
	 * @return true si se realizo correctamente, caso contrario retorna false
	 */
	public boolean agregarAero(Aeropuerto _nuevoAero) {
		if(buscarAeropuerto(_nuevoAero.get_codigo())!=-1 && lstAeropuerto.size()!=0) {
			return false;
		}else {
			lstAeropuerto.add(_nuevoAero);
			return true;
		}
	}
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para modificar Aeropuerto
	 * @param _posicion o indice en la lista
	 * @param _modAero nuevo objeto a agregar
	 * @return true si se realizo correctamente, caso contrario retorna false
	 */
	public boolean modificarAero(int _posicion, Aeropuerto _modAero) {
		if(_posicion<0 || _posicion>lstAeropuerto.size()) {
			return false;
		}else {
			int segPosAero= buscarAeropuerto(_modAero.get_codigo());
			if(segPosAero==-1 || segPosAero==_posicion) {
				lstAeropuerto.set(_posicion, _modAero);
                                return true;
			}
                        else{
                            return false;
                        }
		}
		
		
	}
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para eliminar Aeropuerto
	 * @param _codigoAeropuerto a eliminar 
	 * @return true si se realizo correctamente, caso contrario retorna false
	 */
	
	public boolean eliminarAero(String _codigoAeropuerto) {
		int posicion=buscarAeropuerto(_codigoAeropuerto);
		if(posicion==-1) {
			return false;
		}else {
			lstAeropuerto.remove(posicion);
			return true;
		}
	}
        
        /**
         * Autor:Allan Manuel Orellana
         * Fecha: 28/11/24
         * Metodo para eliminar por indice
         * @param _indice en la coleccion 
         * @return true si se realizo correctamente, caso contrario retorna false
         */
        public boolean eliminarPorIndice(int _indice){
            lstAeropuerto.remove(_indice);
            return true;
        }
	
	//Metodo para imprimir Lista de Aeropuertos
	public void imprimirAero() {
		 System.out.println("--------------Aeropuertos Disponibles--------------\n");
		 
		 
		for(int i=0; i<lstAeropuerto.size(); i++) {
			 System.out.println(lstAeropuerto.get(i).toString());
		}
		
	 }
        
        
        public DefaultComboBoxModel getCboModel(){
            DefaultComboBoxModel model=new DefaultComboBoxModel();
                for(int i=0; i<lstAeropuerto.size(); i++){
                    model.addElement(lstAeropuerto.get(i).get_nombre()+" "+lstAeropuerto.get(i).get_pais());
                
            }
                return model;
        }
        
        
        public Object[][] getArrayGestion() {
		 
		 /**
                  *     private String _codigo;
                        private String _nombre;
                        private String _pais;
                        private String _ciudad;
		
                  */
		 Object [][] array = new Object[this.lstAeropuerto.size()][4];
                    for(int i=0; i<lstAeropuerto.size(); i++) {
			 array[i][0] = lstAeropuerto.get(i).get_codigo();
                         array[i][1] = lstAeropuerto.get(i).get_pais();
                         array[i][2] = lstAeropuerto.get(i).get_nombre();
                         array[i][3] = lstAeropuerto.get(i).get_ciudad();
		}
		return  array;
	 }
}
