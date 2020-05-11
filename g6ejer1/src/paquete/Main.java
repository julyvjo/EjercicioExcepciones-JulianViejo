package paquete;

import Excepciones.ContrasenaInvalidaException;
import Excepciones.NombreInvalidoException;

public class Main {

	public static void main(String[] args) {
		Usuario user = null, user2= null, user3= null, user4= null;
		
		try {
			user = new Usuario("Hernan","a12361236");
			System.out.println(user.toString());
		} catch (NombreInvalidoException | ContrasenaInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			user2 = new Usuario("Alberto","abcd");
			System.out.println(user2.toString());
		} catch (NombreInvalidoException | ContrasenaInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			user3 = new Usuario("piero","1236aaa");
			System.out.println(user3.toString());
		} catch (NombreInvalidoException | ContrasenaInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			user4 = new Usuario("","aaasssddd");
			System.out.println(user4.toString());
		} catch (NombreInvalidoException | ContrasenaInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
