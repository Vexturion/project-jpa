/**
 * 
 */
package com.bassntunes.www.project_jpa.DAO;

import java.util.List;

import com.bassntunes.www.project_jpa.entity.SubGenero;

/**
 * @author Horiz
 * interface DAO que realiza el crud con JPA para la tabla de subgenero
 *
 */
public interface SubGeneroDAO {

	/**
	 * metodo que nos permite guardar un nuevo registro de subGenero
	 * @param subGenero a guardar
	 */
	void guardar(SubGenero subGenero);
	
	/**
	 * metodo que nos permite actualizar las caracteristicas de un subGenero
	 * @param subGenero
	 */
	void actualizar(SubGenero subGenero);
	
	/**
	 * metodo que permite eliminar una subGenero
	 * @param id de la subGenero que queremos eliminar
	 */
	void eliminar(Integer id);
	
	/**
	 * metodo que obtiene la lista de todas las subGeneros
	 * @return lista con objetos de tipo subGenero
	 */
	List<SubGenero> consultar();
	
	/**
	 * 
	 * @param id de la subGenero a consultar
	 * @return subGenero consultada
	 */
	SubGenero consultarPorId(Integer id);
	
}
