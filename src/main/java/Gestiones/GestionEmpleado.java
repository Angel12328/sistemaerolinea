package Gestiones;

import java.util.LinkedList;

import clases.Azafata;
import clases.Empleado;
import clases.Piloto;
import java.io.Serializable;



public class GestionEmpleado implements Serializable{
	private LinkedList<Empleado> listEmpleado=new LinkedList<Empleado>();

	//Constructor por defecto
	public GestionEmpleado() {
		super();
	}

	//sett y gett
	public LinkedList<Empleado> getListEmpleado() {
		return listEmpleado;
	}

	public void setListEmpleado(LinkedList<Empleado> listEmpleado) {
		this.listEmpleado = listEmpleado;
	}
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para Buscar Empleado
	 * @param _codigoEmpl a buscar
	 * @return -1 si no lo encuentra, caso contrario retorna la posicion en la coleccion
	 */
	public int buscarEmpleado(String _codigoEmpl) {
		int posicion=-1;
		for (int i=0; i<listEmpleado.size();i++){
			if(listEmpleado.get(i).get_numEmpleado().equals(_codigoEmpl)){
				posicion=i;
				break;
				
			}
		}
		return posicion;
	}
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para buscar Empleado
	 * @param _codEmpl a buscar
	 * @return  retorna el objeto en la coleccion
	 */
	/*RETORNAR EMPLEADOS QUE NO SON AZAFATA PILOTO*/
	public Empleado buscarEmplObj(String _codEmpl) {
		Empleado _EmpleadoEncontrado =null;
		for(int i=0; i<listEmpleado.size();i++) {
			if(listEmpleado.get(i).get_numEmpleado().equals(_codEmpl) && listEmpleado.get(i) instanceof Empleado) {
				_EmpleadoEncontrado= listEmpleado.get(i);
				break;
			}
		}
		return _EmpleadoEncontrado;
	}
	
        /**
         * Autor: Allan Manuel Orellana
         * Fecha: 27/10/24
         * Metodo para buscar empleado de la clase Azafata
         * @param _codEmpl a buscar 
         * @return el objeto en la coleccion         */
	public Azafata buscarEmplAzafata(String _codEmpl) {
		Azafata _EmpleadoEncontrado =null;
		for(int i=0; i<listEmpleado.size();i++) {
			if(listEmpleado.get(i).get_numEmpleado().equals(_codEmpl) && listEmpleado.get(i) instanceof Azafata ) {
				_EmpleadoEncontrado= (Azafata) listEmpleado.get(i);
				break;
			}
		}
		return _EmpleadoEncontrado;
	}
	
        /**
         * Autor: Allan Manuel Orellna
         * Fecha: 27/10/24
         * Metodo para busacar empleado de la clase Piloto
         * @param _codEmpl a buscar 
         * @return el objeto en la coleccion
         */
	public Piloto buscarEmplPiloto(String _codEmpl) {
		Piloto _EmpleadoEncontrado =null;
		for(int i=0; i<listEmpleado.size();i++) {
			if(listEmpleado.get(i).get_numEmpleado().equals(_codEmpl)&& listEmpleado.get(i) instanceof Piloto) {
				_EmpleadoEncontrado= (Piloto) listEmpleado.get(i);
				break;
			}
		}
		return _EmpleadoEncontrado;
	}
	
        /**
         * Autor: Allan Manuel Orellana Orellana
         * Fecha: 27/10/24
         * Metodo para agregar empleado de la clase Azafata
         * @param _nuevoEmpleado objeto de la clase Azafata a agregar
         * @return  true si se realizo correctamente, caso contrario retorna false
         */
	public boolean agregarEmpleadoAzafata(Azafata _nuevoEmpleado) {
		if(buscarEmpleado(_nuevoEmpleado.get_numEmpleado())!=-1 && listEmpleado.size()!=0) {
			return false;
		}else {
			listEmpleado.add(_nuevoEmpleado);
			return true;
		}
	}
        
        /** Autor: Allan Manuel Orellana Orellana
         * Fecha: 27/10/24
         * Metodo para agregar empleado de la clase Piloto
         * @param _nuevoEmpleado objeto de la clase Piloto a agregar 
         * @return true si se realizo correctamente, caso contrario retorna false
         */
	public boolean agregarEmpleadoPiloto(Piloto _nuevoEmpleado) {
		if(buscarEmpleado(_nuevoEmpleado.get_numEmpleado())!=-1 && listEmpleado.size()!=0) {
			return false;
		}else {
			listEmpleado.add(_nuevoEmpleado);
			return true;
		}
	}
	
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para agregar Empleado
	 * @param _nuevoEmpleado a gregar
	 * @return true si se realizo correctamente, caso contrario retorna false
	 */
	public boolean agregarEmpleado(Empleado _nuevoEmpleado) {
		if(buscarEmpleado(_nuevoEmpleado.get_numEmpleado())!=-1 && listEmpleado.size()!=0) {
			return false;
		}else {
			listEmpleado.add(_nuevoEmpleado);
			return true;
		}
	}
	
	
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para Modificar Empleado
	 * @param _posicion en la coleccion
	 * @param _modEmpleado nuevo objeto a agregar
	 * @return true si se realizo correctamente, caso contrario retorna false
	 */ 
	
	public boolean modificarEmpleado(int _posicion, Empleado _modEmpleado) {
		if(_posicion<0 || _posicion>listEmpleado.size()) {
			return false;
		}else {
			int EmplEncontrado= buscarEmpleado(_modEmpleado.get_numEmpleado());
			if(EmplEncontrado==-1 || EmplEncontrado==_posicion) {
				listEmpleado.set(_posicion, _modEmpleado);
			}
			return true;
		}
			
	}
	
        /**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para Modificar Empleado de la clase Azafata
	 * @param _posicion en la coleccion
	 * @param _modEmpleado nuevo objeto de la clase Azafata a agregar
	 * @return true si se realizo correctamente, caso contrario retorna false
	 */ 
	
	public boolean modificarAzafata(int _posicion, Azafata _modEmpleado) {
		if(_posicion<0 || _posicion>listEmpleado.size()) {
			return false;
		}else {
			int EmplEncontrado= buscarEmpleado(_modEmpleado.get_numEmpleado());
			if(EmplEncontrado==-1 || EmplEncontrado==_posicion) {
				listEmpleado.set(_posicion, _modEmpleado);
			}
			return true;
		}
			
	}
        
        /**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para Modificar Empleado de la clase Piloto
	 * @param _posicion en la coleccion
	 * @param _modEmpleado nuevo objeto de la clase Piloto a agregar
	 * @return true si se realizo correctamente, caso contrario retorna false
	 */ 
	
	public boolean modificarPiloto(int _posicion, Piloto _modEmpleado) {
		if(_posicion<0 || _posicion>listEmpleado.size()) {
			return false;
		}else {
			int EmplEncontrado= buscarEmpleado(_modEmpleado.get_numEmpleado());
			if(EmplEncontrado==-1 || EmplEncontrado==_posicion) {
				listEmpleado.set(_posicion, _modEmpleado);
			}
			return true;
		}
			
	}
	
	
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para Eliminar Empleado
	 * @param _codigoEmpleado a eliminar
	 * @return true si se realizo correctamente, caso contrario retorna false
	 */
	public boolean eliminarEmpleado(String _codigoEmpleado) {
		int posicion=buscarEmpleado(_codigoEmpleado);
		if(posicion==-1) {
			return false;
		}else {
			listEmpleado.remove(posicion);
			return true;
		}

	}
	
	/**
	 * Metodo para imprimir lista de Empleados
	 */
	public void imprimirEmpleados() {
		 System.out.println("--------------Lista de Empleados--------------\n");
			for(int i=0; i<listEmpleado.size(); i++) {
				 System.out.println(listEmpleado.get(i).toString()); 
			}
	}
        
          public Object[][] getArrayGestion() {
		 
		 /**
                  *     private String _codigo;
                        private String _nombre;
                        private String _pais;
                        private String _ciudad;
		
                  */
		 Object [][] array = new Object[this.listEmpleado.size()][4];
                    for(int i=0; i<listEmpleado.size(); i++) {
			 array[i][0] = listEmpleado.get(i).get_numEmpleado();
                         array[i][1] = listEmpleado.get(i).get_nombre()+" "+listEmpleado.get(i).get_apellido();;
                         array[i][2] = listEmpleado.get(i).get_telefono();
                         array[i][3] = listEmpleado.get(i).get_correoElectronico();
                         
		}
		return  array;
	 }
          
           public Empleado getAeroByIndex(int indice){
            return listEmpleado.get(indice);
        }
           
           public boolean eliminarPorIndice(int _indice){
            listEmpleado.remove(_indice);
            return true;
        }
        
}
