package Gestiones;

import GUI.MDIPrincipal;
import java.util.LinkedList;

import clases.Vuelo;
import clases.controlVueloBuscCliente;
import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;
import util.AdminFechas;
import util.AdminSerializacion;

public class GestionVuelo implements Serializable {
    private LinkedList<Vuelo> listVuelos=new LinkedList<Vuelo>();
    private LinkedList<controlVueloBuscCliente> controlPosiciones=new LinkedList<controlVueloBuscCliente>();
    
    public LinkedList<Vuelo> getListVuelos() {
        return listVuelos;
    }

    public LinkedList<controlVueloBuscCliente> getControlPosiciones() {
        return controlPosiciones;
    }

    public GestionVuelo() {
        super();
    }
        
        
        

	public boolean agregarcontrolRuta(controlVueloBuscCliente _control){
            controlPosiciones.add(_control);
            return true;
        }
        
	public boolean eliminarControlRuta(){
            controlPosiciones.clear();
            return true;
        }
        
	public int buscarVuelo(String _codigovuelo) { //string tentativo posiblemente sea tipo Vuelo
		int posicion =-1;
		for(int i=0; i<listVuelos.size(); i++) {
			if(listVuelos.get(i).get_codigoVuelo().equals(_codigovuelo)) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
        
        
        /**
         * METODO PARA BUSCAR LOS VUELOS FILTRADOS POR EL CLIENTE
         * RELLENA UNA LISTA CACHE DE POSICIONES DE RUTAS EN EL VUELO
         * @param origen
         * @param destino
         * @param fecha
         * @return booleano
         */
        public boolean buscarVueloCliente(String origen,String destino,String fecha) { //string tentativo posiblemente sea tipo Vuelo
		
                //LinkedList<controlVueloBuscCliente> listVuelosEncotr=new LinkedList<controlVueloBuscCliente>();
                //busca vuelos
		for(int i=0; i<listVuelos.size(); i++) {
                    
                    //busca origenes
                    for(int j=0; j<listVuelos.get(i).listRutas.size(); j++){
                        if(listVuelos.get(i).listRutas.get(j).get_origen().get_ciudad().equals(origen) && listVuelos.get(i).listRutas.get(j).getFechSalidaString().equals(fecha)){
                            //System.out.println();
                            controlVueloBuscCliente controlPosiciones=new controlVueloBuscCliente();
                            controlPosiciones.setCodigoVuelo(listVuelos.get(i).get_codigoVuelo());
                            controlPosiciones.setPosicionVuelo(i);
                            controlPosiciones.setPosicionOrigen(j);
                            /*
                            controlVueloBuscCliente controlOrigen=new controlVueloBuscCliente();
                            controlOrigen.setCodigoVuelo(listVuelos.get(i).get_codigoVuelo());
                            controlOrigen.setPosicionOrigen(j);
                            controlOrigen.setTipo("origen");
                            agregarcontrolRuta(controlOrigen);
                            */
                            //controlPosiciones.add("origen"+Integer.toString(j));
                            
                            //busca  destinos
                            int contadorEscalas = 0;
                            for(int k=j; k<listVuelos.get(i).listRutas.size(); k++){
                                
                                if(listVuelos.get(i).listRutas.get(k).get_destino().get_ciudad().equals(destino)){
                                    controlVueloBuscCliente controlPosicionesCopia=new controlVueloBuscCliente();
                                    controlPosicionesCopia=(controlVueloBuscCliente) controlPosiciones;
                                    controlPosicionesCopia.setPosicionDestino(k);
                                    System.out.println("Seteo destino"+ k);
                                    controlPosicionesCopia.setEscalas(contadorEscalas);
                                    agregarcontrolRuta(controlPosicionesCopia);
                                    break;
                                    //AdminSerializacion.serializacion(MDIPrincipal.gVuelo, "gVuelo.obj");
                                    /*
                                    controlVueloBuscCliente controlDestino=new controlVueloBuscCliente();
                                    controlDestino.setCodigoVuelo(listVuelos.get(i).get_codigoVuelo());
                                    controlDestino.setPosicionDestino(k);
                                    controlDestino.setTipo("destino");
                                    controlDestino.setPosicionOrigen(j);
                                    agregarcontrolRuta(controlDestino);
                                    */
                                    //listVuelosEncotr.add(listVuelos.get(i));
                                    //break;
                                    //agregarcontroRuta()
                                    
                                }
                                contadorEscalas++;
                            }
                            contadorEscalas=0;
                        }
                    }
                    
		}
		return true;
	}
	
  	public Vuelo buscarVueloObj(String _codVuelo) {
  		
		Vuelo _VueloEcontrado =null;
		for(int i=0; i<listVuelos.size();i++) {
			if(listVuelos.get(i).get_codigoVuelo().equals(_codVuelo)) {
				_VueloEcontrado= listVuelos.get(i);
				break;
			}
		}
		return _VueloEcontrado;
	}
	


	public boolean agregarVuelo(Vuelo _nuevoVuelo) {
		if(buscarVuelo(_nuevoVuelo.get_codigoVuelo())!=-1 && listVuelos.size()!=0) {
			return false;
		}else {
			listVuelos.add(_nuevoVuelo);
			return true;
		}
	}
	
	public boolean modificarVuelo(int _posicion, Vuelo _modVuelo) {
		if(_posicion<0 || _posicion>listVuelos.size()) {
			return false;
		}else {
			int segPosVuelo= buscarVuelo(_modVuelo.get_codigoVuelo());
			if(segPosVuelo==-1 || segPosVuelo==_posicion) {
				listVuelos.set(_posicion, _modVuelo);
			}
			return true;
		}
			
	}
	
	public boolean eliminarVuelo(String _codigoVuelo) {
		int posicion=buscarVuelo(_codigoVuelo);
		if(posicion==-1) {
			return false;
		}else {
			listVuelos.remove(posicion);
			return true;
		}
	}
	
	 public void imprimirVuelo() {
		 System.out.println("--------------Vuelos Disponibles--------------\n");
		 //System.out.println(listVuelos.toString());
		 
		for(int i=0; i<listVuelos.size(); i++) {
			 System.out.println(listVuelos.get(i).toString());
		}
		
	 }
	 
         /**
          * ARRAY DE VUELOS BUSCADO AL CLIENTE
          * @return 
          */
	public Object[][] getArrayVuelosClienteModel() {
                Object[][] array =new Object[this.controlPosiciones.size()][9]; 
		//buscarVueloObj() 
                
		for(int i=0; i<controlPosiciones.size(); i++) {
                          //Origenes  
                         array[i][0]=listVuelos.get(controlPosiciones.get(i).getPosicionVuelo()).listRutas.get(controlPosiciones.get(i).getPosicionOrigen()).get_origen().get_nombre();
                         array[i][1]=listVuelos.get(controlPosiciones.get(i).getPosicionVuelo()).listRutas.get(controlPosiciones.get(i).getPosicionOrigen()).get_origen().get_ciudad(); 
			 array[i][2]=listVuelos.get(controlPosiciones.get(i).getPosicionVuelo()).listRutas.get(controlPosiciones.get(i).getPosicionOrigen()).get_origen().get_pais();
                         array[i][3]=listVuelos.get(controlPosiciones.get(i).getPosicionVuelo()).listRutas.get(controlPosiciones.get(i).getPosicionOrigen()).get_fechasalida();
                         //Destinos
                         array[i][4]=listVuelos.get(controlPosiciones.get(i).getPosicionVuelo()).listRutas.get(controlPosiciones.get(i).getPosicionDestino()).get_destino().get_nombre();
                         array[i][5]=listVuelos.get(controlPosiciones.get(i).getPosicionVuelo()).listRutas.get(controlPosiciones.get(i).getPosicionDestino()).get_destino().get_ciudad();
                         array[i][6]=listVuelos.get(controlPosiciones.get(i).getPosicionVuelo()).listRutas.get(controlPosiciones.get(i).getPosicionDestino()).get_destino().get_pais();
                         array[i][7]=listVuelos.get(controlPosiciones.get(i).getPosicionVuelo()).listRutas.get(controlPosiciones.get(i).getPosicionDestino()).get_fechallegada();
                         if(controlPosiciones.size()>0 && controlPosiciones.get(i).getEscalas()==0)
                            array[i][8]="Vuelo Directo";
                         else
                            array[i][8]=Integer.toString(controlPosiciones.get(i).getEscalas())+" Escala";
                         
		}
                return array;
		
        } 
        public Object[][] getArrayModelCarrito(GestionVuelo gVuelo){
            Object[][] array =new Object[this.controlPosiciones.size()][7];
            try{
                System.out.println("TAMANO"+controlPosiciones.size());
                for(int i=0; i<controlPosiciones.size(); i++){
                    Vuelo vuelo =gVuelo.buscarVueloObj(controlPosiciones.get(i).getCodigoVuelo());
                    array[i][0]=controlPosiciones.get(i).getCodigoVuelo();
                    array[i][1]=vuelo.listRutas.get(controlPosiciones.get(i).getPosicionOrigen()).get_origen().get_ciudad();
                    array[i][2]=vuelo.listRutas.get(controlPosiciones.get(i).getPosicionDestino()).get_destino().get_ciudad();

                    array[i][3]=vuelo.listRutas.get(controlPosiciones.get(i).getPosicionOrigen()).get_fechasalida();
                    array[i][4]=vuelo.listRutas.get(controlPosiciones.get(i).getPosicionDestino()).get_fechallegada();

                    if(controlPosiciones.size()>0 && controlPosiciones.get(i).getEscalas()==0)
                       array[i][5]="Vuelo Directo";
                    else
                       array[i][5]=Integer.toString(controlPosiciones.get(i).getEscalas())+" Escala";

                    array[i][6]=vuelo.get_precioVuelo()+vuelo.get_moneda();

                }
            }catch(Exception e){}
            return array;
        }
        
        public Object[][] getArrayModelVueloCarritoInfo(GestionVuelo gVuelo,int posicion){
          
            Object[][] array =new Object[posicion+1][7];
            try{
                System.out.println("TAMANO"+controlPosiciones.size());
                System.out.println(controlPosiciones);
                Vuelo vuelo =gVuelo.buscarVueloObj(controlPosiciones.get(posicion).getCodigoVuelo());
                array[posicion][0]=controlPosiciones.get(posicion).getCodigoVuelo();
                array[posicion][1]=vuelo.listRutas.get(controlPosiciones.get(posicion).getPosicionOrigen()).get_origen().get_ciudad();
                array[posicion][2]=vuelo.listRutas.get(controlPosiciones.get(posicion).getPosicionDestino()).get_destino().get_ciudad();

                array[posicion][3]=vuelo.listRutas.get(controlPosiciones.get(posicion).getPosicionOrigen()).get_fechasalida();
                array[posicion][4]=vuelo.listRutas.get(controlPosiciones.get(posicion).getPosicionDestino()).get_fechallegada();

                if(controlPosiciones.size()>0 && controlPosiciones.get(posicion).getEscalas()==0)
                   array[posicion][5]="Vuelo Directo";
                else
                   array[posicion][5]=Integer.toString(controlPosiciones.get(posicion).getEscalas())+" Escala";

                array[posicion][6]=vuelo.get_precioVuelo()+vuelo.get_moneda();
            }catch(Exception e){}
            return array;
        }
        
        

    @Override
    public String toString() {
        return "GestionVuelo{" + "listVuelos=" + listVuelos + ", controlPosiciones=" + controlPosiciones + '}';
    }
        
	 

}
