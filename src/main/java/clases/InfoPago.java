package clases;

public abstract class InfoPago {
	protected String _codPago;
	protected Factura _infoFactura;
	
	public InfoPago(String _codPago, Factura _infoFactura) {
		super();
		this._codPago = _codPago;
		this._infoFactura = _infoFactura;
	}
	public InfoPago() {
		super();
	}
	public String get_codPago() {
		return _codPago;
	}
	public void set_codPago(String _codPago) {
		this._codPago = _codPago;
	}
	public Factura get_infoFactura() {
		return _infoFactura;
	}
	public void set_infoFactura(Factura _infoFactura) {
		this._infoFactura = _infoFactura;
	}
	
	
	
	
	
}
