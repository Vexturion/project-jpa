/**
 * 
 */
package com.bassntunes.www.project_jpa.DAO.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.bassntunes.www.project_jpa.DAO.DisqueraDAO;
import com.bassntunes.www.project_jpa.Impl.DisqueraDAOImpl;
import com.bassntunes.www.project_jpa.entity.Disquera;

/**
 * @author Horiz
 *
 */
class DisqueraDAOImplTest {

	 private DisqueraDAO disqueraDAO = new DisqueraDAOImpl();
	
	/**
	 * Test method for {@link com.bassntunes.www.project_jpa.Impl.DisqueraDAOImpl#guardar(com.bassntunes.www.project_jpa.entity.Disquera)}.
	 */
	@Test
	void testGuardar() {
		
		Disquera disquera = new Disquera();
		
		disquera.setDescripcion("Roadrunner Records");
		disquera.setFechaCreacion(LocalDateTime.now());
		disquera.setEstatus(true);
		
		this.disqueraDAO.guardar(disquera);
	}

	/**
	 * Test method for {@link com.bassntunes.www.project_jpa.Impl.DisqueraDAOImpl#actualizar(com.bassntunes.www.project_jpa.entity.Disquera)}.
	 */
	@Test
	void testActualizar() {
		Disquera disqueraConsultada = this.disqueraDAO.consultarPorId(9);
		
		disqueraConsultada.setDescripcion("Iron Maiden");
		
		this.disqueraDAO.actualizar(disqueraConsultada);
	}

	/**
	 * Test method for {@link com.bassntunes.www.project_jpa.Impl.DisqueraDAOImpl#eliminar(com.bassntunes.www.project_jpa.entity.Disquera)}.
	 */
	@Test
	void testEliminar() {
		Integer id = 9;
		
		this.disqueraDAO.eliminar(id);
	}

	/**
	 * Test method for {@link com.bassntunes.www.project_jpa.Impl.DisqueraDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<Disquera> disquerasConsultadas = this.disqueraDAO.consultar();
		
		assertTrue(disquerasConsultadas.size()>0);
		
		disquerasConsultadas.forEach(disquera -> {
			System.out.println("Disquera: " + disquera.getDescripcion());
		});
	}

	/**
	 * Test method for {@link com.bassntunes.www.project_jpa.Impl.DisqueraDAOImpl#consultarPorId(java.lang.Integer)}.
	 */
	@Test
	void testConsultarPorId() {
		Disquera disquera = this.disqueraDAO.consultarPorId(7);
		
		assertNotNull(disquera);
		
		System.out.println("Disquera: " + disquera.getDescripcion());
	}
	
	@Test
	void testConsultarPorDescripcionJPQL() {
		
		Disquera disqueraConsultada = this.disqueraDAO.consultarPorDescripcionJPQL("MegaForce");
		
		assertNotNull(disqueraConsultada);
		
		System.out.println("Disquera por descripcion: " + disqueraConsultada.getDescripcion());
		
	}

	@Test
	void testConsultarPorDescripcionNativo() {
Disquera disqueraConsultada = this.disqueraDAO.consultarPorDescripcionNativo("MegaForce");
		
		assertNotNull(disqueraConsultada);
		
		System.out.println("Disquera por descripcion: " + disqueraConsultada.getDescripcion());
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
