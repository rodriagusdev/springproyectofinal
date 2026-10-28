package com.red.api.services;

import java.util.List;

public interface IService<T> {
	public T save (T t);
	public List<T> findAll();
	public T findById(Long id);
}
