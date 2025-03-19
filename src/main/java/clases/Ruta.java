package clases;

import java.io.Serializable;
import java.util.Date;

public class Ruta implements Serializable{
	
	//Atributos
	private String _codigo;
	private Aeropuerto _origen;
	private Aeropuerto _destino;
	private Date _fechasalida;
	private Date _fechallegada;
        private String _fechSalidaString;
        private String _fechLlegadaString;
        private String _horaSalidaString;
        private String _horaLegadaString;

    public String getHoraSalidaString() {
        return _horaSalidaString;
    }

    public void setHoraSalidaString(String _horaSalidaString) {
        this._horaSalidaString = _horaSalidaString;
    }

    public String getHoraLegadaString() {
        return _horaLegadaString;
    }

    public void setHoraLegadaString(String _horaLegadaString) {
        this._horaLegadaString = _horaLegadaString;
    }
        
        public String getFechSalidaString() {
            return _fechSalidaString;
        }

        public void setFechSalidaString(String _fechSalidaString) {
            this._fechSalidaString = _fechSalidaString;
        }

        public String getFechLlegadaString() {
            return _fechLlegadaString;
        }

        public void setFechLlegadaString(String _fechLlegadaString) {
            this._fechLlegadaString = _fechLlegadaString;
        }
        
	
        
	//Cosntructor por defecto

    public Ruta() {
        super();
    }

    //Constructor que recibe todos los parametros
    public Ruta(String _codigo, Aeropuerto _origen, Aeropuerto _destino, Date _fechasalida, Date _fechallegada, String _fechSalidaString, String _fechLlegadaString, String _horaSalidaString, String _horaLegadaString) {
        this._codigo = _codigo;
        this._origen = _origen;
        this._destino = _destino;
        this._fechasalida = _fechasalida;
        this._fechallegada = _fechallegada;
        this._fechSalidaString = _fechSalidaString;
        this._fechLlegadaString = _fechLlegadaString;
        this._horaSalidaString = _horaSalidaString;
        this._horaLegadaString = _horaLegadaString;
    }


	
	//Sett y gett
	public String get_codigo() {
		return _codigo;
	}

	public void set_codigo(String _codigo) {
            
                if(_codigo==null || _codigo.equals("") ){
                       throw new IllegalArgumentException(" Código es un campo obligatorio");
                    }else{
                      this._codigo = _codigo;
                    }
		
                
	}

	public Aeropuerto get_origen() {
		return _origen;
	}

	public void set_origen(Aeropuerto _origen) {
            
		this._origen = _origen;
	}

	public Aeropuerto get_destino() {
		return _destino;
	}

	public void set_destino(Aeropuerto _destino) {
		this._destino = _destino;
	}

	public Date get_fechasalida() {
		return _fechasalida;
	}

	public void set_fechasalida(Date _fechasalida) {
		this._fechasalida = _fechasalida;
	}

	public Date get_fechallegada() {
		return _fechallegada;
	}

	public void set_fechallegada(Date _fechallegada) {
		this._fechallegada = _fechallegada;
	}

	@Override
	public String toString() {
		return "\nCodigo de ruta: " + _codigo + "\nOrigen: " + _origen + "\nDestino: " + _destino + "\nFecha de salida: "
				+ _fechasalida + "\nFecha de llegada: " + _fechallegada  ;
	}
	
	
	
	
	
}
