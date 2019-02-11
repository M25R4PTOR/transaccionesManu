package ejemplo.mapper;

import org.apache.ibatis.annotations.Param;

import ejemplo.modelo.Pedido;

public interface PedidoMapper {

	Pedido getPedido(@Param("idPedido") Integer idPedido);

	int insertarPedido(@Param("pedido") Pedido pedido);

	int modificarPedido(@Param("pedido") Pedido pedido);

	int eliminarPedido(@Param("idPedido") Integer idPedido);
}
