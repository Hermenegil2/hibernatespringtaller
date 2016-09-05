package py.edu.facitec.hibernatespringtaller.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContexts;

import org.springframework.stereotype.Repository;

import py.edu.facitec.hibernatespringtaller.model.Producto;

@Repository
public class ProductoDAO {
			
			@PersistenceContext
			private EntityManager manager;
			
			public void save(Producto producto){
				manager.persist(producto);
			}
}
