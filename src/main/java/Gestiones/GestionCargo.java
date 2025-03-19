package Gestiones;

import java.util.LinkedList;

import clases.Cargo;
import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;



public class GestionCargo implements Serializable{
	private LinkedList<Cargo> listCargo=new LinkedList<Cargo>();

	//Constructor por defecto
	public GestionCargo() {
		super();
	}

	//sett y gett
	public LinkedList<Cargo> getListCargo() {
		return listCargo;
	}

	public void setListCargo(LinkedList<Cargo> listCargo) {
		this.listCargo = listCargo;
	}
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para buscar Cargo
	 * @param _codigoCargo a buscar
	 * @return -1 si no lo encuentra, caso contrario retorna la posicion en la coleccion
	 */
	public int buscarCargo(int _codigoCargo) {
		int posicion=-1;
		for (int i=0; i<listCargo.size();i++){
			if(listCargo.get(i).get_codigo()==_codigoCargo){
				posicion=i;
				break;
				
			}
		}
		return posicion;
	}
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para buscar Cargo
	 * @param _codigoCargo a buscar
	 * @return retorna el objeto en la coleccion
	 */
	public Cargo buscarCargoObj(int _codigoCargo) {
		Cargo _cargoEncontrado =null;
		for(int i=0; i<listCargo.size();i++) {
			if(listCargo.get(i).get_codigo()==_codigoCargo) {
				_cargoEncontrado= listCargo.get(i);
				break;
			}
		}
		return _cargoEncontrado;
	}
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para agregar Cargo
	 * @param _nuevoCargo a agregar
	 * @return true si se realizo correctamente, caso contrario retorna false
	 */
	public boolean agregarCargo(Cargo _nuevoCargo) {
		if(buscarCargo(_nuevoCargo.get_codigo())!=-1 && listCargo.size()!=0) {
			return false;
		}else {
			listCargo.add(_nuevoCargo);
			return true;
		}
	}
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para Modificar Cargo
	 * @param _posicion o indice en la Lista
	 * @param _modCargo nuevo objeto a agregar
	 * @return true si se realizo correctamente, caso contrario retorna false
	 */
	
	public boolean modificarCargo(int _posicion, Cargo _modCargo) {
		if(_posicion<0 || _posicion>listCargo.size()) {
			return false;
		}else {
			int segPosCargo= buscarCargo(_modCargo.get_codigo());
			if(segPosCargo==-1 || segPosCargo==_posicion) {
				listCargo.set(_posicion, _modCargo);
			}
			return true;
		}
		
		
	}
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para eliminar cargo por posicion
	 * @param _codigoCargo a eliminar
	 * @return true si se realizo correctamente, caso contrario retorna false
	 */
	 
	public boolean eliminarCargo(int _codigoCargo) {
		int posicion=buscarCargo(_codigoCargo);
		if(posicion==-1) {
			return false;
		}else {
			listCargo.remove(posicion);
			return true;
		}

	}

	//Metodo para imprimir las lista de cargos
	public void imprimirCargo() {
		 System.out.println("--------------Lista de Cargos--------------\n");
			for(int i=0; i<listCargo.size(); i++) {
				 System.out.println(listCargo.get(i).toString());
			}
	}
        
         public boolean eliminarPorIndice(int _indice){
            listCargo.remove(_indice);
            return true;
        }
        
         public Cargo getCargoByIndex(int indice){
            return listCargo.get(indice);
        }
        
         public Object[][] getArrayGestion() {
		 
	/*	
	private int _codigo;
	private String _descripcioncargo; */
	
		 Object [][] array = new Object[this.listCargo.size()][2];
                    for(int i=0; i<listCargo.size(); i++) {
			 array[i][0] = listCargo.get(i).get_codigo();
                         array[i][1] = listCargo.get(i).get_descripcioncargo();
                        
		}
		return  array;
	 }
         
            public DefaultComboBoxModel getCboModel(){
            DefaultComboBoxModel model=new DefaultComboBoxModel();
                for(int i=0; i<listCargo.size(); i++){
                    model.addElement(listCargo.get(i).get_descripcioncargo());
                
            }
                return model;
        }
            
            
            
               
}
