package com.desamex.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.desamex.app.entity.Usuario;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long>{

}
