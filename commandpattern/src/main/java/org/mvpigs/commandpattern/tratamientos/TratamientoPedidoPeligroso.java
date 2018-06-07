package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;

public class TratamientoPedidoPeligroso implements TratamientoPedido {

	public TratamientoPedidoPeligroso(PedidoPeligroso pedidoConPeligro) {

	}

	public boolean tratar() {

		return false;
	}

}
