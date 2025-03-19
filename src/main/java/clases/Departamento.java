package clases;

import java.io.Serializable;
import java.util.LinkedList;



public class Departamento implements Serializable{
	//Atributos
	private String _codigo;
	private String _descripcion;
	
	
	private LinkedList<Empleado> listEmpleadoDep=new LinkedList<Empleado>();

	//Constructor por defecto
	public Departamento() {
		super();
	}

	//Constructor con parametros
	public Departamento(String _codigo, String _nombre, String _descripcion, LinkedList<Empleado> listDepartamento) {
		super();
		this._codigo = _codigo;
		this._descripcion = _descripcion;
		this.listEmpleadoDep = listDepartamento;
	}
	
	//sett y gett

	public String get_codigo() {
		return _codigo;
	}

	public void set_codigo(String _codigo) {
		this._codigo = _codigo;
	}

	

	public String get_descripcion() {
		return _descripcion;
	}

	public void set_descripcion(String _descripcion) {
		this._descripcion = _descripcion;
	}

	public LinkedList<Empleado> getListDepartamento() {
		return listEmpleadoDep;
	}

	public void setListDepartamento(LinkedList<Empleado> listDepartamento) {
		this.listEmpleadoDep = listDepartamento;
	}

	//to string
	@Override
	public String toString() {
		return "\nid-Departamento: " + _codigo + "\nDecsripcion departamento: " + _descripcion
				+ ", listDepartamento=" + listEmpleadoDep ;
	}
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para buscar Empleado 
	 * @param _codigoEmpleado a buscar
	 * @return -1 si no lo encuentra, caso contrario retorna la posicion en la coleccion
	 */
	public int buscarEmpleadoDep(String _codigoEmpleado) {
		int posicion=-1;
		for (int i=0; i<listEmpleadoDep.size();i++){
			if(listEmpleadoDep.get(i).get_numEmpleado().equals(_codigoEmpleado)){
				posicion=i;
				break;
				
			}
		}
		return posicion;
	
	}
	
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para buscar empleado
	 * @param _codigoEmpleado a buscar
	 * @return  retorna el objeto en la coleccion
	 */
	public Empleado buscarEmplObjDep(String _codigoEmpleado) {
		Empleado _emplEncontrado =null;
		for(int i=0; i<listEmpleadoDep.size();i++) {
			if(listEmpleadoDep.get(i).get_numEmpleado().equals(_codigoEmpleado)) {
				_emplEncontrado= listEmpleadoDep.get(i);
				break;
			}
		}
		return _emplEncontrado;
	}
	

	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para agregar empleado
	 * @param _nuevoEmpl objeto a agregar
	 * @return true si se realizo correctamente, caso contrario retorna false
	 */
	public boolean agregarEmplDep(Empleado _nuevoEmpl) {
		if(buscarEmpleadoDep(_nuevoEmpl.get_numEmpleado())!=-1 && listEmpleadoDep.size()!=0) {
			return false;
		}else {
			listEmpleadoDep.add(_nuevoEmpl);
			return true;
		}
	}
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para modificar Empleado
	 * @param _posicion o indice en la lista
	 * @param _modEmpl nuevo objeto a agregar
	 * @return true si se realizo correctamente, caso contrario retorna false
	 */
	
	public boolean modificarEmplDep(int _posicion, Empleado _modEmpl) {
		if(_posicion<0 || _posicion>listEmpleadoDep.size()) {
			return false;
		}else {
			int segPosEmpl= buscarEmpleadoDep(_modEmpl.get_numEmpleado());
			if(segPosEmpl==-1 || segPosEmpl==_posicion) {
				listEmpleadoDep.set(_posicion, _modEmpl);
			}
			return true;
		}
		
		
	}
	
	/**Autor:Allan Manuel Orellana
	 * Fecha: 27/10/24
	 * Metodo para eliminar Empleado
	 * @param _codigoEmpleado a eliminar
	 * @return true si se realizo correctamente, caso contrario retorna false
	 */
	
	public boolean eliminarEmplDep(String _codigoEmpleado) {
		int posicion=buscarEmpleadoDep(_codigoEmpleado);
		if(posicion==-1) {
			return false;
		}else {
			listEmpleadoDep.remove(posicion);
			return true;
		}

	}
	
	/**
	 * Metodo para imprimir las ListA DE Empleados por Departamento
	 */
	public void imprimirEmplDep() {
		 System.out.println("--------------Lista de Empleados por Departamento--------------\n");
			for(int i=0; i<listEmpleadoDep.size(); i++) {
				 System.out.println(listEmpleadoDep.get(i).toString());
			}
	}
}
