package ejemplo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ejemplo.modelo.Cliente;
import ejemplo.modelo.Pedido;
import ejemplo.servicio.Servicio;

public class Menu {

	public static void main(String[] args) {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("spring-configuracion/config-spring.xml");

		final Servicio servicio = contexto.getBean(Servicio.class);

		final Cliente cliente = new Cliente(null, "NombreInsert", "Ap1Insert Ap2Insert");

		final Cliente clienteModificado = new Cliente(1, "NombreMod", "Ap1Mod Ap2Mod");

		final Pedido pedido = new Pedido(null, "PedidoInsert", 99, 0);

		final Pedido pedidoModificado = new Pedido(1, "PedidoModif", 55, 0);

		final Cliente clienteConjunto = new Cliente(null, "Conjunto", "Conjunto");
		final Pedido pedidoConjunto = new Pedido(null, "Conjunto", 100, 0);

		try {
			// System.out.println(servicio.getCliente(0));
			// servicio.insertarCliente(cliente);
			// servicio.modificarCliente(clienteModificado);
			servicio.eliminarCliente(0);

			// System.out.println(servicio.getPedido(0));
			// servicio.insertarPedido(pedido);
			// servicio.modificarPedido(pedidoModificado);
			// servicio.eliminarPedido(1);

			// servicio.insertarPedidoConClienteNuevo(clienteConjunto, pedidoConjunto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
