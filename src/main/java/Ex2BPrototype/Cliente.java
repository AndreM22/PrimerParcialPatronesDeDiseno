package Ex2BPrototype;

public class Cliente {
	public static void main(String[] args) {
		
		Camara cam = new Camara();
		cam.setFoco(10);
		cam.setLente("5mp");
		
		Celular celular1 = new Celular();
		celular1.modelo="A1";
		celular1.setPeso(60);
		celular1.setCamara(cam);
		celular1.setTamano("6 pulgadas");
		celular1.setOrigen("Bolivia");
		celular1.setImei(10001);
		
		Celular celular2 = (Celular) celular1.clone();
		celular2.setImei(10002);
		
		Celular celular3 = (Celular) celular1.clone();
		celular3.setImei(10003);
		
		Celular celular4 = (Celular) celular1.clone();
		celular4.setImei(10004);
		
		Celular celular5 = (Celular) celular1.clone();
		celular5.setImei(10005);
		
		celular1.mostrarInfo();
		celular2.mostrarInfo();
		celular3.mostrarInfo();
		celular4.mostrarInfo();
		celular5.mostrarInfo();
	}
}
