/**
 * 
 */
package com.bassntunes.www.project_jpa.DAO;


import java.util.List;

import com.bassntunes.www.project_jpa.entity.Disquera;

/**
 * @author Horiz
 * interfaz que genera el dao para las transacciones del CRUD para la tabla disquera
 */
public interface DisqueraDAO {

	/**
	 * metodo que nos permite guardar un nuevo registro de disquera
	 * @param disquera a guardar
	 */
	void guardar(Disquera disquera);
	
	/**
	 * metodo que nos permite actualizar las caracteristicas de una disquera
	 * @param disquera
	 */
	void actualizar(Disquera disquera);
	
	/**
	 * metodo que permite eliminar una disquera
	 * @param id de la disquera que queremos eliminar
	 */
	void eliminar(Integer id);
	
	/**
	 * metodo que obtiene la lista de todas las disqueras
	 * @return lista con objetos de tipo disquera
	 */
	List<Disquera> consultar();
	
	/**
	 * 
	 * @param id de la disquera a consultar
	 * @return disquera consultada
	 */
	Disquera consultarPorId(Integer id);
	
	/**
	 * metodo que permite consultar con JPQL la disquera a partir de una descripcion
	 * @param descripcion {@link String} descripcion de la disquera}
	 * @return {@link String} la disquera consultada
	 */
	Disquera consultarPorDescripcionJPQL(String descripcion);
	
	/**
	 * metodo que permite consultar con SQL nativo la disquera a partir de una descripcion
	 * @param descripcion {@link String} descripcion de la disquera
	 * @return {@link String} la disquera consultada
	 */
	Disquera consultarPorDescripcionNativo(String descripcion);
	
}
