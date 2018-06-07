package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;

public class PedidoPeligrosoOrden implements Pedido, PedidoPeligroso {

	public PedidoPeligrosoOrden(String string, String string2) {

	}

	public int peso() {

		return 0;
	}

	public String destino() {

		return null;
	}

	public Object getId() {

		return null;
	}

	public String instrucciones() {

		return null;
	}

}
