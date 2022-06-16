package com.sistemabancario.persistence;
import java.util.List;

public interface GenericDao {
	//? representa cualquier hijo 
	public List<? extends Object> findAll();
	public Boolean update(Object entity);
	public Boolean create(Object entity);
	public Boolean delete(Object entity);
}
