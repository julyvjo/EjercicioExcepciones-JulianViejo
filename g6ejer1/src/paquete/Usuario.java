package paquete;

import Excepciones.NombreInvalidoException;
import Excepciones.ContrasenaInvalidaException;

public class Usuario {
	protected String nombre;
	protected String contrasena;

	// constructor

	public Usuario(String nombre, String contrasena) throws NombreInvalidoException, ContrasenaInvalidaException {
		this.setNombre(nombre);
		this.setContrasena(contrasena);
	}

	// g y s

	public void setNombre(String nombre) throws NombreInvalidoException {
		if (nombre == null)
			throw new NombreInvalidoException("El nombre no puede ser null");
		else if (nombre.equals(""))
			throw new NombreInvalidoException("El nombre no puede estar vacio");
		else
			this.nombre = nombre;
	}

	public void setContrasena(String contrasena) throws ContrasenaInvalidaException {
		if (contrasena == null)
			throw new ContrasenaInvalidaException("La contraseña no puede ser null");
		else if (contrasena.length() < 6)
			throw new ContrasenaInvalidaException("La contraseña debe tener al menos 6 caracteres");
		else if (contrasena.charAt(0) < 65 || 122 < contrasena.charAt(0) || (contrasena.charAt(0) < 97 && 90 < contrasena.charAt(0)))
			throw new ContrasenaInvalidaException("La contraseña debe comenzar con una letra");
		else
			this.contrasena = contrasena;
	}

	public String getNombre() {
		return nombre;
	}

	public String getContrasena() {
		return contrasena;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", contrasena=" + contrasena + "]";
	}
	
	

}
