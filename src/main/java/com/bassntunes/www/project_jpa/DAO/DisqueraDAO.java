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

	void guardar(Disquera disquera);
	
	void actualizar(Disquera disquera);
	
	void eliminar(Integer id);
	
	List<Disquera> consultar();
	
	Disquera consultarPorId(Integer id);
	
	
	
}
