package com.desamex.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desamex.app.entity.Usuario;
import com.desamex.app.service.IUsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	IUsuarioService usuarioService;
    
	@GetMapping("/usuarios")
	public List<Usuario> getAllUsuarios(){
		return usuarioService.getAll();
	}
	
	@GetMapping("/usuario/{idUsuario}")
	public Usuario getOne(@PathVariable(value="idUsuario")long id){
		
		return usuarioService.get(id);
	}
	
	@PostMapping("/usuario")
	public void add(Usuario usuario) {
		usuarioService.post(usuario);
	}
	
	@PutMapping("/usuario/{idUsuario}")
	public void update(Usuario usuario,@PathVariable(value="idUsuario") long id) {
		
		usuarioService.put(usuario, id);
	}
	
	@DeleteMapping("/usuario/{idUsuario}")
    public void update(@PathVariable(value="idUsuario") long id) {
		
		usuarioService.delete(id);
	}
	
}
