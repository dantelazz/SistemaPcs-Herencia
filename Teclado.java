package src;

public class Teclado extends DispoEntrada{
	private int idTeclado;
	private static int contadorTeclados;

	public Teclado(String tipoEntrada, String marca) {
		super (tipoEntrada,marca);
		this.idTeclado = ++Teclado.contadorTeclados;
		
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teclado [idTeclado=");
		builder.append(idTeclado);
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
