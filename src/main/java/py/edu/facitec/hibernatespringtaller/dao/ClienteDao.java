package py.edu.facitec.hibernatespringtaller.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.hibernatespringtaller.model.Cliente;

//Clase encargada de la manipulacion de datos
//posibilita utilizar posteriormente @Autowired
@Repository
public class ClienteDao {
			
	
			@PersistenceContext
			private EntityManager manager;
			
			public void save(Cliente cliente){
				manager.persist(cliente);
			}
			
}
