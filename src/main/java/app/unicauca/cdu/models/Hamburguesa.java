package app.unicauca.cdu.models;

public class Hamburguesa {
	
	private Integer mesa;
	private String tipo;
	private String clase;
	private Integer numIngredientesEx;
	
	public Hamburguesa() {
		
	}

	public Hamburguesa(Integer mesa,String tipo, String clase, Integer numIngredientesEx) {
		super();
		this.mesa = mesa;
		this.tipo = tipo;
		this.clase = clase;
		this.numIngredientesEx = numIngredientesEx;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public Integer getNumIngredientesEx() {
		return numIngredientesEx;
	}

	public void setNumIngredientesEx(Integer numIngredientesEx) {
		this.numIngredientesEx = numIngredientesEx;
	}

	public Integer getMesa() {
		return mesa;
	}

	public void setMesa(Integer mesa) {
		this.mesa = mesa;
	}
	
}
