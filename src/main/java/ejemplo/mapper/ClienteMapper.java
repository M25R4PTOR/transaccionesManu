package ejemplo.mapper;

import org.apache.ibatis.annotations.Param;

import ejemplo.modelo.Cliente;

public interface ClienteMapper {

	Cliente getCliente(@Param("idCliente") Integer idCliente);

	int insertarCliente(@Param("cliente") Cliente cliente);

	int modificarCliente(@Param("cliente") Cliente cliente);

	int eliminarCliente(@Param("idCliente") Integer idCliente);

	int getIdMaxCliente();

	int getIdCliente(@Param("idCliente") Integer idCliente);
}
