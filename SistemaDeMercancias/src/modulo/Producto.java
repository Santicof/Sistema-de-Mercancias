package modulo;

public class Producto extends Mercancia {
private String producto;
private double precioProducto;
private double porcentajeDescuento;
private boolean esDescuentoEn2Unidad;
public Producto(String codMercancia, String producto, double precioProducto, double porcentajeDescuento,
		boolean esDescuentoEn2Unidad) throws Exception {
	super(codMercancia);
	this.producto = producto;
	this.precioProducto = precioProducto;
	this.porcentajeDescuento = porcentajeDescuento;
	this.esDescuentoEn2Unidad = esDescuentoEn2Unidad;
}








public String getProducto() {
	return producto;
}
public void setProducto(String producto) {
	this.producto = producto;
}
public double getPrecioProducto() {
	return precioProducto;
}
public void setPrecioProducto(double precioProducto) {
	this.precioProducto = precioProducto;
}
public double getPorcentajeDescuento() {
	return porcentajeDescuento;
}
public void setPorcentajeDescuento(double porcentajeDescuento) {
	this.porcentajeDescuento = porcentajeDescuento;
}
public boolean isEsDescuentoEn2Unidad() {
	return esDescuentoEn2Unidad;
}
public void setEsDescuentoEn2Unidad(boolean esDescuentoEn2Unidad) {
	this.esDescuentoEn2Unidad = esDescuentoEn2Unidad;
}
@Override
public String toString() {
	return "\n---------Producto--------\n [producto=" + producto + ", precioProducto=" + precioProducto + ", porcentajeDescuento="
			+ porcentajeDescuento + ", esDescuentoEn2Unidad=" + esDescuentoEn2Unidad + " "+super.toString();
}








@Override
public double calcularPrecioFinal() {
	double total=this.precioProducto;
	double desc=0;
	if(this.esDescuentoEn2Unidad==true) {
		desc=this.precioProducto*((this.porcentajeDescuento/2)/100);
	}
	return total-desc;
}

}
