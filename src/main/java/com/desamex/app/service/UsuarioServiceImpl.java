package com.desamex.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desamex.app.dao.IUsuarioDAO;
import com.desamex.app.entity.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
    
	@Autowired
	IUsuarioDAO usuarioDAO;
	
	@Override
	public Usuario get(long id) {
		
		return usuarioDAO.findById(id).get();
	}

	@Override
	public List<Usuario> getAll() {
		
		return (List<Usuario>) usuarioDAO.findAll();
	}

	@Override
	public void post(Usuario usuario) {

		usuarioDAO.save(usuario);
	}

	@Override
	public void put(Usuario usuario, long id) {

		usuarioDAO.findById(id).ifPresent((x)->{
			usuario.setIdUsuario(id);
			usuarioDAO.save(usuario);
				
			});
		
	}

	@Override
	public void delete(long id) {

		usuarioDAO.deleteById(id);
	}

}
