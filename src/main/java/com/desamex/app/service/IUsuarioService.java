package com.desamex.app.service;

import java.util.List;

import com.desamex.app.entity.Usuario;

public interface IUsuarioService {

	public Usuario get(long id);
	public List<Usuario> getAll();
	public void post(Usuario usuario);
	public void put(Usuario usuario, long id);
	public void delete(long id);
	
}
