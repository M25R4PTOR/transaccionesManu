package ejemplo.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ejemplo.excepciones.ServicioException;
import ejemplo.modelo.Cliente;
import ejemplo.modelo.Pedido;
import ejemplo.repositorio.RepositorioCliente;
import ejemplo.repositorio.RepositorioPedido;

@Service
public class Servicio {

	@Autowired
	private RepositorioCliente repositorioCliente;

	@Autowired
	private RepositorioPedido repositorioPedido;

	public Cliente getCliente(int idCliente) {
		return repositorioCliente.getCliente(idCliente);
	}

	public void insertarCliente(Cliente cliente) {
		this.repositorioCliente.insertarCliente(cliente);
	}

	public int modificarCliente(Cliente cliente) {
		return this.repositorioCliente.modificarCliente(cliente);
	}

	public int eliminarCliente(int idCliente) throws ServicioException {
		Cliente aux = getCliente(idCliente);
		if (aux == null) {
			throw new ServicioException("El cliente no existe");
		}
		try {
			return this.repositorioCliente.eliminarCliente(idCliente);
		} catch (Exception e) {
			throw new ServicioException("No se puede eliminar un cliente con un pedido");
		}
	}

	public Pedido getPedido(int idPedido) {
		return this.repositorioPedido.getPedido(idPedido);
	}

	public void insertarPedido(Pedido cliente) {
		this.repositorioPedido.insertarPedido(cliente);
	}

	public int modificarPedido(Pedido cliente) {
		return this.repositorioPedido.modificarPedido(cliente);
	}

	public int eliminarPedido(int idPedido) throws ServicioException {
		Pedido aux = this.repositorioPedido.getPedido(idPedido);
		if (aux == null) {
			throw new ServicioException("El pedido no existe");
		}
		return this.repositorioPedido.eliminarPedido(idPedido);
	}

	public int getIdMaxCliente() {
		return this.repositorioCliente.getIdMaxCliente();
	}

	@Transactional
	public void insertarPedidoConClienteNuevo(Cliente cliente, Pedido pedido) {
		insertarCliente(cliente);

		Pedido auxP = new Pedido(null, pedido.getNombre(), pedido.getPrecio(), getIdMaxCliente());

		insertarPedido(auxP);
	}
}
