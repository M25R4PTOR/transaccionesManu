package ejemplo.repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ejemplo.mapper.ClienteMapper;
import ejemplo.modelo.Cliente;

@Repository
public class RepositorioCliente {

	@Autowired
	private ClienteMapper clienteMapper;

	public Cliente getCliente(int idCliente) {
		return this.clienteMapper.getCliente(idCliente);
	}

	public void insertarCliente(Cliente cliente) {
		this.clienteMapper.insertarCliente(cliente);
	}

	public int modificarCliente(Cliente cliente) {
		return this.clienteMapper.modificarCliente(cliente);
	}

	public int eliminarCliente(int idCliente) {
		return this.clienteMapper.eliminarCliente(idCliente);
	}

	public int getIdMaxCliente() {
		return this.clienteMapper.getIdMaxCliente();
	}

	public int getIdCliente(int idCliente) {
		return this.clienteMapper.getIdCliente(idCliente);
	}
}
