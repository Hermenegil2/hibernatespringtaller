package py.edu.facitec.hibernatespringtaller.controller;

import java.util.List;

import javax.persistence.EntityManager;

public abstract class DaoGenerico<T> {
	private Class<T> entityClass;

	protected abstract EntityManager getEntityManager();
	public DaoGenerico(Class<T> entityClass){
		this.entityClass=entityClass;
	}
	
	public List<T> getLista(){
		return getEntityManager().createQuery
				("from "+entityClass.getSimpleName(), entityClass).getResultList();
			
		}
		
}
