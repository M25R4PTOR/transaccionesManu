package ejemplo.repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ejemplo.mapper.PedidoMapper;
import ejemplo.modelo.Pedido;

@Repository
public class RepositorioPedido {

	@Autowired
	private PedidoMapper pedidoMapper;

	public Pedido getPedido(int idPedido) {
		return this.pedidoMapper.getPedido(idPedido);
	}

	public void insertarPedido(Pedido cliente) {
		this.pedidoMapper.insertarPedido(cliente);
	}

	public int modificarPedido(Pedido cliente) {
		return this.pedidoMapper.modificarPedido(cliente);
	}

	public int eliminarPedido(int idPedido) {
		return this.pedidoMapper.eliminarPedido(idPedido);
	}
}
