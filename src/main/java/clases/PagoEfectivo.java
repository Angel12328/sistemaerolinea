package clases;

public class PagoEfectivo extends InfoPago {
	private boolean _estado=false;
	
	public boolean is_estado() {
		return _estado;
	}

	public void set_estado(boolean _estado) {
		this._estado = _estado;
	}

	public PagoEfectivo(String _codPago, Factura _infoFactura, boolean _estado) {
		super(_codPago, _infoFactura);
		this._estado = _estado;
	}

	public PagoEfectivo(String _codPago, Factura _infoFactura) {
		super(_codPago, _infoFactura);
	}

	public PagoEfectivo() {
		super();
	}
	
	
}
