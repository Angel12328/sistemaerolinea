package Gestiones;

import java.util.LinkedList;

import clases.Pasajero;
import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;

/*
 *VAMOS A GESTIONAR LOS PASAJEROS POR CODIGO DE BOLETO NO POR VUELO
*/
public class GestionPasajero implements Serializable{
	private LinkedList<Pasajero> listPasajero=new LinkedList<Pasajero>();

    public LinkedList<Pasajero> getListPasajero() {
        return listPasajero;
    }

// HACER LAS GESTIONES DE PASAJERO
	
	public void imprimirPasajero() {
		 System.out.println("--------------Lista de Pasajeros--------------\n");
			for(int i=0; i<listPasajero.size(); i++) {
				 System.out.println(listPasajero.get(i).toString());
			}
	}
	//public boolean agregarPasajero(){}
	
	public int buscarPasajero(String _codigoPasajero) { //string tentativo posiblemente sea tipo Vuelo
		int posicion =-1;
		for(int i=0; i<listPasajero.size(); i++) {
			if(listPasajero.get(i).get_codigoPasajero().equals(_codigoPasajero)) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
  	public Pasajero buscarPasajeroObj(String _codPasajero) {
  		
		Pasajero _PasajeroEnc =null;
		for(int i=0; i<listPasajero.size();i++) {
			if(listPasajero.get(i).get_codigoPasajero().equals(_codPasajero)) {
				_PasajeroEnc= listPasajero.get(i);
				break;
			}
		}
		return _PasajeroEnc;
	}
  	
	public boolean agregarPasajero(Pasajero _nuevoPasajero) {
                System.out.println(_nuevoPasajero.get_codigoPasajero());
		if(buscarPasajero(_nuevoPasajero.get_codigoPasajero())!=-1 && listPasajero.size()!=0) {
			return false;
		}else {
			listPasajero.add(_nuevoPasajero);
			return true;
		}
	}
	
	public boolean modificarPasajero(int _posicion, Pasajero _modPasajero) {
		if(_posicion<0 || _posicion>listPasajero.size()) {
			return false;
		}else {
			int segPosPasajero= buscarPasajero(_modPasajero.get_codigoPasajero());
			if(segPosPasajero==-1 || segPosPasajero==_posicion) {
				listPasajero.set(_posicion, _modPasajero);
			}
			return true;
		}
			
	}
	
	public boolean eliminarPasajero(String _codigoPasajero) {
		int posicion=buscarPasajero(_codigoPasajero);
		if(posicion==-1) {
			return false;
		}else {
			listPasajero.remove(posicion);
			return true;
		}
	}
         public DefaultComboBoxModel getCboModel(){
             LinkedList<String> TipoPasajero=new LinkedList<String>();
             TipoPasajero.add("Menor de Edad");
             TipoPasajero.add("Adulto");
             TipoPasajero.add("Tercera de Edad");
             DefaultComboBoxModel model=new DefaultComboBoxModel();
             for(int i=0; i<TipoPasajero.size(); i++){
                 model.addElement(TipoPasajero.get(i));
             }
             return model;
         }
        public String getTipoPasajeroByIndex(int _indice){
            LinkedList<String> TipoPasajero=new LinkedList<String>();
            TipoPasajero.add("Menor de Edad");
            TipoPasajero.add("Adulto");
            TipoPasajero.add("Tercera de Edad");
            return TipoPasajero.get(_indice);
         
         }
  	public Pasajero getPasajeroByIndex(int _codIndice) {
            try{
                return listPasajero.get(_codIndice);
            }catch(Exception e){}
            return null;
	}
        
        public boolean eliminarPasajeroPorIndice(int _indice){
            try{
                listPasajero.remove(_indice);
                return true;
            }catch(Exception e){}
            return false;
        }
        public boolean eliminarPasajerosCache(){
            listPasajero.clear();
            return true;
        }
	 public Object[][] getArrayModel() {
            Object[][] array =new Object[this.listPasajero.size()][7]; 
            try{
                for(int i=0; i<listPasajero.size(); i++) {
                         array[i][0]=listPasajero.get(i).get_codigoPasajero();
                         array[i][1]=listPasajero.get(i).get_dni();
                         array[i][2]=listPasajero.get(i).get_nombre();
                         array[i][3]=listPasajero.get(i).get_apellido();
                         array[i][4]=listPasajero.get(i).get_telefono();
                         array[i][5]=listPasajero.get(i).get_correoElectronico();
                         array[i][6]=listPasajero.get(i).get_descripcionPasajero();

                }
            }catch(Exception e){}
            return array;
		
        } 
}
