package Ex5BInterpreter;


public class Cliente {

	public static void main(String[] args) {
        String entrada="I II III IV V VI VII VIII IX X";

        Interpreter interpretarRomanos = new Interpreter(entrada);
        System.out.println("Entrada: "+entrada);
        System.out.println("Salida: "+interpretarRomanos.interpretar());
	}

}
