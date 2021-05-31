package Ex1BSingleton;

public class Cliente {
	public static void main(String[] args) {

		Thread estudiante1 = new Thread(new Runnable() {
			@Override
			public void run() {
				PagoMatricula singleton = PagoMatricula.getInstance();
				Estudiante e = new Estudiante();
				e.setCi(123);
				e.setNombre("Juan");
				singleton.pagar(e, "4:00", 10000);
				singleton.mostrarInfo();
				System.out.println("*******");
			}
		});

		Thread estudiante2 = new Thread(new Runnable() {
			@Override
			public void run() {
				PagoMatricula singleton = PagoMatricula.getInstance();
				Estudiante e = new Estudiante();
				e.setCi(246);
				e.setNombre("George");
				singleton.pagar(e, "5:00", 1111);
				singleton.mostrarInfo();
				System.out.println("*******");

			}
		});
		Thread estudiante3 = new Thread(new Runnable() {
			@Override
			public void run() {
				PagoMatricula singleton = PagoMatricula.getInstance();
				Estudiante e = new Estudiante();
				e.setCi(369);
				e.setNombre("Maria");
				singleton.pagar(e, "4:56", 222);
				singleton.mostrarInfo();
				System.out.println("*******");

			}
		});
		Thread estudiante4 = new Thread(new Runnable() {
			@Override
			public void run() {
				PagoMatricula singleton = PagoMatricula.getInstance();
				Estudiante e = new Estudiante();
				e.setCi(123);
				e.setNombre("Juan");
				singleton.pagar(e, "4:00", 10000);
				singleton.mostrarInfo();
				System.out.println("*******");

			}
		});
		// La información se muestra en cada hilo para ver como se va actuailzando la
		// información de los estudiantes
		estudiante1.start();
		estudiante2.start();
		estudiante3.start();
		estudiante4.start();

	}

}
