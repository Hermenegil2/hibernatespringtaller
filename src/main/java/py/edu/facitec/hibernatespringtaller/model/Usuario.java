package py.edu.facitec.hibernatespringtaller.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
	
	    @Id
		private String login;
		private String password;
		
		@OneToMany
		private List<Pedido> pedidos;
		@ManyToOne
		private Departamento departamento;
		
		
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public List<Pedido> getPedidos() {
			return pedidos;
		}
		public void setPedidos(List<Pedido> pedidos) {
			this.pedidos = pedidos;
		}
		public Departamento getDepartamento() {
			return departamento;
		}
		public void setDepartamento(Departamento departamento) {
			this.departamento = departamento;
		}
		@Override
		public String toString() {
			return "Usuario [login=" + login + ", password=" + password + ", pedidos=" + pedidos + ", departamento="
					+ departamento + "]";
		}
		
		
		
}
