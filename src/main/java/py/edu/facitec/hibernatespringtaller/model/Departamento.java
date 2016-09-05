package py.edu.facitec.hibernatespringtaller.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Departamento {
	
	
			@Id
			@GeneratedValue
			private long id;
			private String descripcion;
			
			@OneToMany
			private List<Usuario> usuario;
			
			@OneToOne
			private Gerente gerente;

			public long getId() {
				return id;
			}

			public void setId(long id) {
				this.id = id;
			}

			public String getDescripcion() {
				return descripcion;
			}

			public void setDescripcion(String descripcion) {
				this.descripcion = descripcion;
			}

			public List<Usuario> getUsuario() {
				return usuario;
			}

			public void setUsuario(List<Usuario> usuario) {
				this.usuario = usuario;
			}

			public Gerente getGerente() {
				return gerente;
			}

			public void setGerente(Gerente gerente) {
				this.gerente = gerente;
			}

			@Override
			public String toString() {
				return "Departamento [id=" + id + ", descripcion=" + descripcion + ", usuario=" + usuario + ", gerente="
						+ gerente + "]";
			}
			
			
			
}
