package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.TratamientoPedido;
import org.mvpigs.commandpattern.pedidos.PedidoInternacional;

public class TratamientoPedidoInternacional implements TratamientoPedido {

	public TratamientoPedidoInternacional(PedidoInternacional pedidoInt) {
	}

	public boolean tratar() {
		if (pedidoInt.destino) {
				return false;
		}else {
		return true;
		}
	}

}
