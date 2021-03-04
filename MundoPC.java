package MundoPc;

import src.Computadora;
import src.Monitor;
import src.Orden;
import src.Raton;
import src.Teclado;


public class MundoPC {

	public static void main (String[] args) {
		
		Monitor monitorHp = new Monitor("HP",13);
		Teclado tecladoHp = new Teclado ("bluetooth","hp");
		Raton ratonhp = new Raton ("Bluetooth", "HP");
		
		Computadora compuHP = new Computadora("Pc Hp", monitorHp,tecladoHp,ratonhp);
		
		Orden orden1 = new Orden();
		orden1.agregarComputadora(compuHP);
		
		orden1.mostrarOrden();
	}
}
