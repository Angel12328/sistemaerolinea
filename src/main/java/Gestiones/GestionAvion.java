package Gestiones;

import java.util.LinkedList;

import clases.Avion;
import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;

public class GestionAvion implements Serializable {
	private LinkedList<Avion> lstAviones= new LinkedList<Avion>();
	
	public GestionAvion() {
		super();
	}
	/**
	 * @author angel
	 * Fecha: 27/10/24
	 * Metodo para buscar aviones
	 * @param _codigoAvion
	 * @return posicion en la coleccion
	 */
	public int buscarAvion(String _codigoAvion) { 
		int posicion =-1;
		for(int i=0; i<lstAviones.size(); i++) {
			if(lstAviones.get(i).get_codigoAvion().equals(_codigoAvion)) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	/**
	 * Fecha: 27/10/24
	 * Metodo para buscar aviones
	 * @param _codAvion
	 * @return objeto en la coleccion
	 */
  	public Avion buscarAvionObj(String _codAvion) {
  		
		Avion _AvionEcontrado =null;
		for(int i=0; i<lstAviones.size();i++) {
			if(lstAviones.get(i).get_codigoAvion().equals(_codAvion)) {
				_AvionEcontrado= lstAviones.get(i);
				break;
			}
		}
		return _AvionEcontrado;
	}
        
	/**
         
	 * Fecha: 3/11/24
	 * Metodo para buscar aviones por indice
	 * @param _codIndice
	 * @return objeto en la coleccion
	 */
  	public Avion getAvionByIndex(int _codIndice) {
            return lstAviones.get(_codIndice);
	}
        
        public boolean eliminarPorIndice(int _indice){
            lstAviones.remove(_indice);
            return true;
        }
	

  	/**
  	 * @author angel
	 * Fecha: 27/10/24
	 * Metodo para agregar avion
  	 * @param _nuevoAvion
  	 * @return true si agrega el avion false si no
  	 */
	public boolean agregarAvion(Avion _nuevoAvion) {
		if(buscarAvion(_nuevoAvion.get_codigoAvion())!=-1 && lstAviones.size()!=0) {
			return false;
		}else {
			lstAviones.add(_nuevoAvion);
			return true;
		}
	}
	/**
	 * @author angel
	 * Fecha: 27/10/24
	 * Metodo para modificar avion
	 * @param _posicion
	 * @param _modAvion
	 * @return true si modifica el objeto false si no
	 */
	public boolean modificarAvion(int _posicion, Avion _modAvion) {
		if(_posicion<0 || _posicion>lstAviones.size()) {
			return false;
		}else {
			int segPosVuelo= buscarAvion(_modAvion.get_codigoAvion());
			if(segPosVuelo==-1 || segPosVuelo==_posicion) {
				lstAviones.set(_posicion, _modAvion);
			}
			return true;
		}
		
		
	}
	/**
	 * @author angel
	 * Fecha: 27/10/24
	 * Metodo para eliminar avion 
	 * @param _codigoAvion
	 * @return true si elimina el objeto en la coleccion false si no
	 */
	public boolean eliminarAvion(String _codigoAvion) {
		int posicion=buscarAvion(_codigoAvion);
		if(posicion==-1) {
			return false;
		}else {
			lstAviones.remove(posicion);
			return true;
		}
	}
	
	/**
	 * @author angel
	 * Fecha: 27/10/24
	 * Metodo para imprimir los aviones registrados
	 */
	 public void imprimir() {
		 System.out.println("--------------Aviones Disponibles--------------\n");
		 //System.out.println(listVuelos.toString());
		 
		for(int i=0; i<lstAviones.size(); i++) {
			 System.out.println(lstAviones.get(i).toString());
		}
		
	 }
	 public Object[][] getArrayModel() {
                Object[][] array =new Object[this.lstAviones.size()][3]; 
		 
		for(int i=0; i<lstAviones.size(); i++) {
			 array[i][0]=lstAviones.get(i).get_codigoAvion();
                         array[i][1]=lstAviones.get(i).get_aerolinea();
                         array[i][2]=lstAviones.get(i).get_numeroAsientos();

                         
                         
		}
                return array;
		
           } 
         
         public DefaultComboBoxModel getCboModel(){
             DefaultComboBoxModel model=new DefaultComboBoxModel();
             for(int i=0; i<lstAviones.size(); i++){
                 model.addElement(lstAviones.get(i).get_codigoAvion());
             }
             return model;
         }
}
