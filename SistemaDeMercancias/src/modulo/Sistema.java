package modulo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Mercancia> lstMercancia;

	public Sistema() {

		this.lstMercancia = new ArrayList<Mercancia>();
	}

	public List<Mercancia> getLstMercancia() {
		return lstMercancia;
	}

	public Mercancia traerMercancia(String codMercancia) {
		Mercancia mer = null;
		int i = 0;
		while (mer == null && i < lstMercancia.size()) {
			if (lstMercancia.get(i).getCodMercancia().equals(codMercancia)) {
				mer = lstMercancia.get(i);
			}
			i++;
		}
		return mer;
	}

	public List<Mercancia> traerMercancia(boolean enOferta) {
		List<Mercancia> lista = new ArrayList<Mercancia>();

		for (int i = 0; i < lstMercancia.size(); i++) {
			
				if (lstMercancia.get(i) instanceof Producto) {
					Producto pro=(Producto)lstMercancia.get(i);
					if(pro.isEsDescuentoEn2Unidad()==enOferta) {
					lista.add((Producto) lstMercancia.get(i));
				}
					
			} 
				if (lstMercancia.get(i) instanceof Servicio) {
					Servicio ser=(Servicio)lstMercancia.get(i);
					if (ser.isEnPromocion()==enOferta) {
					lista.add((Servicio) lstMercancia.get(i));
				}
			}
		}
		return lista;
	}

	public boolean agregarProducto(String codMercancia, String producto, double precioProducto,
			double porcentajeDescuento, boolean esDescuentoEn2Unidad) throws Exception {
		Mercancia pro = this.traerMercancia(codMercancia);
		if (pro != null) {
			throw new Exception("el producto ya fue aniadido");
		}
		return lstMercancia
				.add(new Producto(codMercancia, producto, precioProducto, porcentajeDescuento, esDescuentoEn2Unidad));

	}

	public boolean agregarServicio(String codMercaderia, String servicio, double presupuesto,
			double porcentajeDescuento, boolean enPromocion) throws Exception {
		Mercancia mer = this.traerMercancia(codMercaderia);
		if (mer != null) {
			throw new Exception("el producto ya existe");
		}
		return lstMercancia.add(new Servicio(codMercaderia, servicio, presupuesto, porcentajeDescuento, enPromocion));
	}

	@Override
	public String toString() {
		return "\n---------Sistema-------\n [lstMercancia=" + lstMercancia + "]";
	}

}
