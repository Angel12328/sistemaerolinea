package Gestiones;


import GUI.MDIPrincipal;
import clases.Asientos;
import clases.Avion;
import java.io.Serializable;
import java.util.LinkedList;
import util.AdminSerializacion;


public class GestionAsientos implements Serializable {
	//se va a buscar por cod asiento y cod avion
	//LA GESTION GESTIONA LOS ASIENTOS DEL AVION
	


	
/**
 CUANDO SE ESTA AGREGANDO UN REGISTRO DE UN NUEVO AVION AL SISTEMA
 */	
       public LinkedList<Asientos> asientosVuelo=new LinkedList<Asientos>();

    public LinkedList<Asientos> getAsientosVuelo() {
        return asientosVuelo;
    }

        public GestionAsientos() {
            super();
        }

       
       
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

  	public Asientos getAsientoByIndex(int _codIndice) {
            try{
               return asientosVuelo.get(_codIndice);
            }catch(Exception e){}
            return null;
            
	}
        
        public boolean eliminarAsientoPorIndice(int _indice){
            asientosVuelo.remove(_indice);
            return true;
        }
        
        public boolean eliminarAsientosCache(){
            asientosVuelo.clear();
            return true;
        }
        
	 public Object[][] getArrayModel() {
            Object[][] array =new Object[this.asientosVuelo.size()][3]; 

            for(int i=0; i<asientosVuelo.size(); i++) {
                     array[i][0]=asientosVuelo.get(i).get_codigoAsiento();
                     array[i][1]=asientosVuelo.get(i).get_numero();
                     array[i][2]=asientosVuelo.get(i).get_categoria();

            }
            return array;
		
        } 
	
}
