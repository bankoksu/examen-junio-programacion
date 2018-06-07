package org.mvpigs.commandpattern.procesadores;

import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;
import org.mvpigs.commandpattern.interfaces.Procesador;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;
import org.mvpigs.commandpattern.pedidos.PedidoInternacional;

public class Oficina implements Procesador {


	public Object printarStatus(Object procesa, PedidoInternacional toComarcaWithLove) {

		return ;
	}

	public Object printarStatus(Object destino, PedidoPeligroso mensaje) {

		return ;
	}

	public boolean procesa(TratamientoPedido pedido) {

		return false;
	}

	public char[] printarStatus(boolean procesa, Pedido pedido) {

		return null;
	}

	
	
}
