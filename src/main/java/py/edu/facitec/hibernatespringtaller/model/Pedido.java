package py.edu.facitec.hibernatespringtaller.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pedido {
	
		@Id
		@GeneratedValue
		private Long id;
		private Date fechaToma;
		private Date fechaEntrega;
		private double total;
		
		@ManyToOne
		private Cliente cliente;
		
		@OneToMany
		private List<ItemPedido> itemPedido;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Date getFechaToma() {
			return fechaToma;
		}

		public void setFechaToma(Date fechaToma) {
			this.fechaToma = fechaToma;
		}

		public Date getFechaEntrega() {
			return fechaEntrega;
		}

		public void setFechaEntrega(Date fechaEntrega) {
			this.fechaEntrega = fechaEntrega;
		}

		public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		public List<ItemPedido> getItemPedido() {
			return itemPedido;
		}

		public void setItemPedido(List<ItemPedido> itemPedido) {
			this.itemPedido = itemPedido;
		}
		
		
}
