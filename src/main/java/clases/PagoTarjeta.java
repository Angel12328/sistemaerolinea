package clases;

public class PagoTarjeta extends InfoPago{
	
	private String _numeroTarjeta;
	private String _vigencia;
	private String _cvv;
	private boolean _estado=false;
	
	public PagoTarjeta() {
		super();
	}
	public PagoTarjeta(String _codPago, Factura _infoFactura, String _numeroTarjeta, String _vigencia, String _cvv, boolean _estado) {
		super(_codPago, _infoFactura);
		this._numeroTarjeta = _numeroTarjeta;
		this._vigencia = _vigencia;
		this._cvv = _cvv;
		this._estado = _estado;
	}

	public String get_numeroTarjeta() {
		return _numeroTarjeta;
	}
	public void set_numeroTarjeta(String _numeroTarjeta) {
		this._numeroTarjeta = _numeroTarjeta;
	}
	public String get_vigencia() {
		return _vigencia;
	}
	public void set_vigencia(String _vigencia) {
		this._vigencia = _vigencia;
	}
	public String get_cvv() {
		return _cvv;
	}
	public void set_cvv(String _cvv) {
		this._cvv = _cvv;
	}
	public boolean is_estado() {
		return _estado;
	}
	public void set_estado(boolean _estado) {
		this._estado = _estado;
	}





	
	
}
