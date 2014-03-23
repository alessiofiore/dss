package it.sas.dss.database.dao;

public interface IGenericDao<T> {
	
	T create(T t);
	
	void delete(Object id);
	
	T find(Object id);
	
	T update(T t);
}
