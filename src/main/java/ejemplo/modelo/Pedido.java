package ejemplo.modelo;

public class Pedido {

	private final Integer idPedido;

	private final String nombre;

	private final Integer precio;

	private final Integer idCliente;

	public Integer getIdPedido() {
		return idPedido;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public Pedido(Integer idPedido, String nombre, Integer precio, Integer idCliente) {
		super();
		this.idPedido = idPedido;
		this.nombre = nombre;
		this.precio = precio;
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", nombre=" + nombre + ", precio=" + precio + ", idCliente=" + idCliente
				+ "]";
	}

}