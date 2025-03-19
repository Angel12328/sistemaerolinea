package Gestiones;

import java.util.LinkedList;

import clases.Departamento;
import java.io.Serializable;



public class GestionDepartamento implements Serializable {
	private LinkedList<Departamento> listDepto=new LinkedList<Departamento>();

	//Constructor por defecto
	public GestionDepartamento() {
		super();
	}

	//sett y gett
	
	public LinkedList<Departamento> getListDepto() {
		return listDepto;
	}

	public void setListDepto(LinkedList<Departamento> listDepto) {
		this.listDepto = listDepto;
	}

	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para buscar Departamento
	 * @param _codigoDepto a buscar
	 * @return -1 si no lo encuentra, caso contrario retorna la posicion en la coleccion
	 */
	public int buscarDepto(String _codigoDepto) {
		int posicion=-1;
		for (int i=0; i<listDepto.size();i++){
			if(listDepto.get(i).get_codigo().equals(_codigoDepto)){
				posicion=i;
				break;
				
			}
		}
		return posicion;
	}
	
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para buscar Departamento
	 * @param _codDepto a buscar 
	 * @return  retorna el objeto en la coleccion
	 */
	public Departamento buscarDeptoObj(String _codDepto) {
		Departamento _deptoEcontrado =null;
		for(int i=0; i<listDepto.size();i++) {
			if(listDepto.get(i).get_codigo().equals(_codDepto)) {
				_deptoEcontrado= listDepto.get(i);
				break;
			}
		}
		return _deptoEcontrado;
	}
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para agregar Departamento
	 * @param _nuevoDepto  nuevo objeto a agregar
	 * @return true si se realizo correctamente, caso contrario retorna false

	 */
	public boolean agregarDepto(Departamento _nuevoDepto) {
		if(buscarDepto(_nuevoDepto.get_codigo())!=-1 && listDepto.size()!=0) {
			return false;
		}else {
			listDepto.add(_nuevoDepto);
			return true;
		}
	}
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para modificar Departamento
	 * @param _posicion en la coleccion 
	 * @param _modDepto nuevo objeto a agregar
	 * @return true si se realizo correctamente, caso contrario retorna false
	 */
	public boolean modificarDepto(int _posicion, Departamento _modDepto) {
		if(_posicion<0 || _posicion>listDepto.size()) {
			return false;
		}else {
			int segPosDepto= buscarDepto(_modDepto.get_codigo());
			if(segPosDepto==-1 || segPosDepto==_posicion) {
				listDepto.set(_posicion, _modDepto);
			}
			return true;
		}
		
		
	}
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para eliminar Departamento
	 * @param _codigoDepto a eliminar 
	 * @return true si se realizo correctamente, caso contrario retorna false
	 */
	public boolean eliminarDepto(String _codigoDepto) {
		int posicion=buscarDepto(_codigoDepto);
		if(posicion==-1) {
			return false;
		}else {
			listDepto.remove(posicion);
			return true;
		}

	}
	
	//Metodo para imprimir la lista de Departamentos 
	public void imprimirDepto() {
		 System.out.println("--------------Lista de Departamentos--------------\n");
			for(int i=0; i<listDepto.size(); i++) {
				 System.out.println(listDepto.get(i).toString());
			}
	}
}
