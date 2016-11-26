package com.carlos.repositories;

import java.util.ArrayList;

public interface IRepositoryBase<TEntity> {
	
	boolean Add(TEntity t);
	boolean Update(TEntity t);
	boolean Remove(TEntity t);
	ArrayList<TEntity> GetAll();
	TEntity GetById(int id);
 }
