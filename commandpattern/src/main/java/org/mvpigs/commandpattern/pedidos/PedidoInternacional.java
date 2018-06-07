package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.Pedido;

public class PedidoInternacional implements Pedido {
	public String Desti;
	public int pes;

	public PedidoInternacional(String destino, int peso) {
		
		
		this.Desti = destino;
		this.pes = peso;
		
	}	

	
	public int peso() {
		return pes;
	}

	public String destino() {

		return Desti;
	}

	public Object getId() {

		return null;
	}


}
