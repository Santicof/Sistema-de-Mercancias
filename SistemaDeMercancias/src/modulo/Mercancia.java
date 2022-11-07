package modulo;

public  abstract class Mercancia {

	protected String codMercancia;

	public Mercancia(String codMercancia) throws Exception {
		
		this.setCodMercancia(codMercancia);
	}

	
	public abstract double calcularPrecioFinal();
	
	public String getCodMercancia() {
		return codMercancia;
	}

	public void setCodMercancia(String codMercancia) throws Exception {
		if(validacion(codMercancia)) {
			
		}
		this.codMercancia = codMercancia;
	}
	
	
	public boolean validacion(String codMercancia) throws Exception {
		if(codMercancia.length()!=7) {
			throw new Exception ("no es valido el codigo de mercancia");
		}
		return true;
	}

	@Override
	public String toString() {
		return "\n-----------Mercancia----------\n [codMercancia=" + codMercancia + "]";
	}
	
	
	
	
	
	
}
