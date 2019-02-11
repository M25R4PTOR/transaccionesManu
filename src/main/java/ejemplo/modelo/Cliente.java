package ejemplo.modelo;

public class Cliente {

	private final Integer idCliente;

	private final String nombre;

	private final String apellidos;

	public Cliente(Integer idCliente, String nombre, String apellidos) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

}
