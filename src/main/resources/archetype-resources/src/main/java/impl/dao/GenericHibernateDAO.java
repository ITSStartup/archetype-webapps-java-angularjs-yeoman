#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.impl.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ${package}.interfaces.dao.GenericDAO;

@Repository
@SuppressWarnings("unchecked")
public abstract class GenericHibernateDAO<T> implements GenericDAO<T> {

	/*
	 * Esse cara é a entidade que passarmos quando extends 
	 * a classe GenericHibernateDAO, observe que ele é bem generico. 
	 */
	private Class<T> persistentClass;

	@Autowired
	private SessionFactory sessionFactory;

	public GenericHibernateDAO(Class<T> persistentClass) {
		super();
		this.persistentClass = persistentClass;
	}
	
	public void saveOrUpdate(T entity) {
		getCurrentSession().saveOrUpdate(entity);
	}
	
	public void delete(T entity) {
		getCurrentSession().delete(entity);
		
	}
	
	public List<T> list() {
		Criteria criteria = getCurrentSession().createCriteria(persistentClass);
		return criteria.list();
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	};
	
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public Class<T> getPersistentClass() {
		return persistentClass;
	}

}