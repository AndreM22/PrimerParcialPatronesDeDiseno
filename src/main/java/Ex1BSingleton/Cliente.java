package Ex1BSingleton;

public class Cliente {
	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {
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

		Thread thread2 = new Thread(new Runnable() {
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
		Thread thread3 = new Thread(new Runnable() {
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
		Thread thread4 = new Thread(new Runnable() {
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
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

	}

}
