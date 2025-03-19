package clases;

import java.io.Serializable;
import java.util.LinkedList;

public class Avion implements Serializable{
	private String _codigoAvion;
	private String _aerolinea;
	private int _numeroAsientos;
	public LinkedList<Asientos> asientos= new LinkedList<Asientos>();
	
	//Constructor por defecto
	public Avion() {
		super();
	}
	
	//Constructor que recibe todos los parametros
	public Avion(String _codigoAvion, String _aerolinea, int _numeroAsientos) {
		super();
		this._codigoAvion = _codigoAvion;
		this._aerolinea = _aerolinea;
		this._numeroAsientos = _numeroAsientos;
	}
	
	//Sett y gett
	public String get_codigoAvion() {
		return _codigoAvion;
	}
	public void set_codigoAvion(String _codigoAvion) {
		this._codigoAvion = _codigoAvion;
	}
	public String get_aerolinea() {
		return _aerolinea;
	}
	public void set_aerolinea(String _aerolinea) {
		this._aerolinea = _aerolinea;
	}
	public int get_numeroAsientos() {
		return _numeroAsientos;
	}
	public void set_numeroAsientos(int _numeroAsientos) {
		this._numeroAsientos = _numeroAsientos;
	}

    @Override
    public String toString() {
        return "Avion{" + "_codigoAvion=" + _codigoAvion + ", _aerolinea=" + _aerolinea + ", _numeroAsientos=" + _numeroAsientos + ", asientos=" + asientos + '}';
    }


	
	//toString
        /*
	@Override
	public String toString() {
		return "\nCodigo Avion: " + _codigoAvion + "\nAerolinea: " + _aerolinea + "\nNumero de asientos: "
				+ _numeroAsientos + "\nAsientos: " + asientos ;
	}
        */

	public Object[][] getArrayModelAsientos() {
            Object[][] array =new Object[asientos.size()][3];
            for(int i=0; i<asientos.size(); i++) {
                     array[i][0]=asientos.get(i).get_codigoAsiento();
                     array[i][1]=asientos.get(i).get_numero();
                     array[i][2]=null;


            }
            return array;

        }         

	
	public void agregarAsientosAvion(int _NBasic, int _NFlex, int _NClassic,int _NAsientos){
		//Avion avion = new Avion();
		//GestionAvion GAvion = new GestionAvion();
		//Asientos asiento=new Asientos();
		//avion=GAvion.buscarAvionObj(_codAvion);
		//GAvion.imprimir();
		//System.out.println(avion);
		int contador=1;
		for(int i=1; i<=_NClassic; i++) {
			Asientos asiento=new Asientos();
			//asiento.set_avion(avion);
			asiento.set_codigoAsiento("C"+ Integer.toString(i));
			asiento.set_categoria("Classic");
			asiento.set_numero(i);
			asientos.add(asiento);
			contador++;
                        //AdminSerializacion.serializacion(GAvion, "gAvion.obj");
		}
		

		for(int j=1; j<=_NFlex; j++) {
			Asientos asiento=new Asientos();
			//asiento.set_avion(avion);
			asiento.set_numero(contador);
			contador++;
			asiento.set_codigoAsiento("F"+ Integer.toString(j));
			asiento.set_categoria("Flex");
			//asiento.set_numero(j);
			asientos.add(asiento);
                        //AdminSerializacion.serializacion(GAvion, "gAvion.obj");
			//contador=j;
		}
		for(int i=1; i<=_NBasic; i++) {
			Asientos asiento=new Asientos();
			//asiento.set_avion(avion);
			asiento.set_codigoAsiento("B"+ Integer.toString(i));
			asiento.set_categoria("Basic");
			asiento.set_numero(contador);
			asientos.add(asiento);
			contador++;
                        //AdminSerializacion.serializacion(GAvion, "gAvion.obj");
		}
		
		
		
	}
	

}
