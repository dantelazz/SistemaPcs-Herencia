package src;

public class DispoEntrada{

	private String tipoEntrada;
	private String marca;
	
	

	public DispoEntrada (String tipoEntrada, String marca) {
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DispoEntrada [tipoEntrada=");
		builder.append(tipoEntrada);
		builder.append(", marca=");
		builder.append(marca);
		builder.append("]");
		return builder.toString();
	}



	public String getTipoEntrada() {
		return tipoEntrada;
	}



	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}

}