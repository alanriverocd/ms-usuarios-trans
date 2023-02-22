package com.desamex.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_usuarios")
public class Usuario implements Serializable{
	
	/**
	 * Alan Rivero
	 */	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "UsuariosSec")
	@SequenceGenerator(
		    name="UsuariosSec",
		    sequenceName = "SEC_USUARIOS",
		    initialValue = 21, 
		    allocationSize = 1
		)
	private long idUsuario;
	private String nombreUsu;
	private String apellidoPat;
	private String apellidoMat;
	private Date fechaNac;	
	private byte[] ineImagen;	
	private String estadoCivil;
	private String direccion;
	private String municipioPer;
	private String estadoPer;
	private String telefonoCasa;
	private String celular;
	private String correo;
	private byte[] imagenUsu;
	
	public long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombreUsu() {
		return nombreUsu;
	}
	public void setNombreUsu(String nombreUsu) {
		this.nombreUsu = nombreUsu;
	}
	public String getApellidoPat() {
		return apellidoPat;
	}
	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}
	public String getApellidoMat() {
		return apellidoMat;
	}
	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public byte[] getIneImagen() {
		return ineImagen;
	}
	public void setIneImagen(byte[] ineImagen) {
		this.ineImagen = ineImagen;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getMunicipioPer() {
		return municipioPer;
	}
	public void setMunicipioPer(String municipioPer) {
		this.municipioPer = municipioPer;
	}
	public String getEstadoPer() {
		return estadoPer;
	}
	public void setEstadoPer(String estadoPer) {
		this.estadoPer = estadoPer;
	}
	public String getTelefonoCasa() {
		return telefonoCasa;
	}
	public void setTelefonoCasa(String telefonoCasa) {
		this.telefonoCasa = telefonoCasa;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public byte[] getImagenUsu() {
		return imagenUsu;
	}
	public void setImagenUsu(byte[] imagenUsu) {
		this.imagenUsu = imagenUsu;
	}
	public Usuario(String nombreUsu, String apellidoPat, String apellidoMat, Date fechaNac, byte[] ineImagen,
			String estadoCivil, String direccion, String municipioPer, String estadoPer, String telefonoCasa,
			String celular, String correo, byte[] imagenUsu) {
		super();
		this.nombreUsu = nombreUsu;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.fechaNac = fechaNac;
		this.ineImagen = ineImagen;
		this.estadoCivil = estadoCivil;
		this.direccion = direccion;
		this.municipioPer = municipioPer;
		this.estadoPer = estadoPer;
		this.telefonoCasa = telefonoCasa;
		this.celular = celular;
		this.correo = correo;
		this.imagenUsu = imagenUsu;
	}
	public Usuario() {
		
	}
	
	
}
