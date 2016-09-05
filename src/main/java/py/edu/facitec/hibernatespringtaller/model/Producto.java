package py.edu.facitec.hibernatespringtaller.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Producto {
			
			@Id
			@GeneratedValue
			private long id;
			private String descripcion;
			private Date fechavencimiento;
			private double precio;
			private Integer cantidad;
			
			@OneToMany
			private List<ItemPedido> itemPedido;

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

			public Date getFechavencimiento() {
				return fechavencimiento;
			}

			public void setFechavencimiento(Date fechavencimiento) {
				this.fechavencimiento = fechavencimiento;
			}

			public double getPrecio() {
				return precio;
			}

			public void setPrecio(double precio) {
				this.precio = precio;
			}

			public Integer getCantidad() {
				return cantidad;
			}

			public void setCantidad(Integer cantidad) {
				this.cantidad = cantidad;
			}

			public List<ItemPedido> getItemPedido() {
				return itemPedido;
			}

			public void setItemPedido(List<ItemPedido> itemPedido) {
				this.itemPedido = itemPedido;
			}

			@Override
			public String toString() {
				return "Producto [id=" + id + ", descripcion=" + descripcion + ", fechavencimiento=" + fechavencimiento
						+ ", precio=" + precio + ", cantidad=" + cantidad + ", itemPedido=" + itemPedido + "]";
			}
			
			
			
			
			
}

