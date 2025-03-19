package Gestiones;

import java.util.LinkedList;

import clases.Cliente;


public class GestionCliente {
	private LinkedList<Cliente> listClientes=new LinkedList<Cliente>();

	public int buscarCliente(String _codigoCliente) { //string tentativo posiblemente sea tipo Vuelo
		int posicion =-1;
		for(int i=0; i<listClientes.size(); i++) {
			if(listClientes.get(i).get_idCliente().equals(_codigoCliente)) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
  	public Cliente buscarClienteObj(String _codCliente) {
  		
		Cliente _clienteEnc =null;
		for(int i=0; i<listClientes.size();i++) {
			if(listClientes.get(i).get_idCliente().equals(_codCliente)) {
				_clienteEnc= listClientes.get(i);
				break;
			}
		}
		return _clienteEnc;
	}
  	
	/**
	 * @author angel
	 * Fecha: 26/10/24
	 * Metodo para agregar cliente 
	 * @param _cliente
	 * @return true si agrega el objeto a la collecion  
	 */
	public boolean agregarCliente(Cliente _nuevoCliente) {
		if(buscarCliente(_nuevoCliente.get_idCliente() )!=-1 && listClientes.size()!=0) {
			return false;
		}else {
			listClientes.add(_nuevoCliente);
			return true;
		}
	}

	
	
	
}
