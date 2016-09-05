package py.edu.facitec.hibernatespringtaller.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity //indicamos que se trata de una identidad a persistir en la base de datos
public class Cliente {
				
		
			@Id //Clave primaria
			@GeneratedValue //generacion de codigo automatico
			private Integer id;
			private String nombre;
			private String correo;
			
			@OneToMany
			private List<Pedido> pedidos;
			
			
			
			public Integer getId() {
				return id;
			}
			public void setId(Integer id) {
				this.id = id;
			}
			public String getNombre() {
				return nombre;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public String getCorreo() {
				return correo;
			}
			public void setCorreo(String correo) {
				this.correo = correo;
			}
			
			
			
}
