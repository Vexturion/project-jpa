/**
 * 
 */
package com.bassntunes.www.project_jpa.DAO.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.bassntunes.www.project_jpa.DAO.SubGeneroDAO;
import com.bassntunes.www.project_jpa.Impl.SubGeneroDAOImpl;
import com.bassntunes.www.project_jpa.entity.Genero;
import com.bassntunes.www.project_jpa.entity.SubGenero;

/**
 * @author Horiz
 * clase test para comprobar el funcionamiento de los metodos del crud sub genero
 */
class SubGeneroDAOImplTest {

	private SubGeneroDAO subGeneroDAO = new SubGeneroDAOImpl();
	
	/**
	 * Test method for {@link com.bassntunes.www.project_jpa.Impl.SubGeneroDAOImpl#guardar(com.bassntunes.www.project_jpa.entity.SubGenero)}.
	 */
	@Test
	void testGuardar() {
		SubGenero subGenero = new SubGenero();
		subGenero.setDescripcion("Thrash Metal");
		subGenero.setFechaCreacion(LocalDateTime.now());
		subGenero.setEstatus(true);
		
		Genero genero = new Genero();
		genero.setDescripcion("Heavy Metal");
		genero.setFechaCreacion(LocalDateTime.now());
		genero.setEstatus(true);
		
		subGenero.setGenero(genero);
		
		this.subGeneroDAO.guardar(subGenero);
	}

	/**
	 * Test method for {@link com.bassntunes.www.project_jpa.Impl.SubGeneroDAOImpl#actualizar(com.bassntunes.www.project_jpa.entity.SubGenero)}.
	 */
	@Test
	void testActualizar() {
		SubGenero subGeneroConsultado = this.subGeneroDAO.consultarPorId(7);
		
		subGeneroConsultado.setDescripcion("Power Metal");
		subGeneroConsultado.getGenero().setDescripcion("Metal");
		
		this.subGeneroDAO.actualizar(subGeneroConsultado);
	}

	/**
	 * Test method for {@link com.bassntunes.www.project_jpa.Impl.SubGeneroDAOImpl#eliminar(java.lang.Integer)}.
	 */
	@Test
	void testEliminar() {
		this.subGeneroDAO.eliminar(7);
	}

	/**
	 * Test method for {@link com.bassntunes.www.project_jpa.Impl.SubGeneroDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<SubGenero> subGenerosConsultados = this.subGeneroDAO.consultar();
		
		assertTrue(subGenerosConsultados.size()>0);
		
		subGenerosConsultados.forEach(subGenero ->{
			System.out.println("SubGenero: " + subGenero.getDescripcion());
			System.out.println("Genero: " + subGenero.getGenero().getDescripcion());
		});
	}

	/**
	 * Test method for {@link com.bassntunes.www.project_jpa.Impl.SubGeneroDAOImpl#consultarPorId(java.lang.Integer)}.
	 */
	@Test
	void testConsultarPorId() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#Object()}.
	 */
	@Test
	void testObject() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#getClass()}.
	 */
	@Test
	void testGetClass() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#hashCode()}.
	 */
	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#equals(java.lang.Object)}.
	 */
	@Test
	void testEquals() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#clone()}.
	 */
	@Test
	void testClone() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#toString()}.
	 */
	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#notify()}.
	 */
	@Test
	void testNotify() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#notifyAll()}.
	 */
	@Test
	void testNotifyAll() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#wait()}.
	 */
	@Test
	void testWait() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#wait(long)}.
	 */
	@Test
	void testWaitLong() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#wait(long, int)}.
	 */
	@Test
	void testWaitLongInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#finalize()}.
	 */
	@Test
	void testFinalize() {
		fail("Not yet implemented");
	}

}
