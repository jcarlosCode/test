package com.carlos.repositories;

public interface IRepositoryBase<TEntity> {
	
	boolean Add(TEntity t);
	boolean Update(TEntity t);
 }
