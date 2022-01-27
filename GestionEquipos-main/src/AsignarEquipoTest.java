import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Alvaro
 *
 */
class AsignarEquipoTest {

	/**
	 * Test method for {@link AsignarEquipo#AsignarEquipo()}.
	 */
	
	//Asignar un jugador que sea nulo
	void testSetJugadorNulo() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "";
		int edadValida=0;//No hay forma de poner un int como nulo
		String idiomaValido = "";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	//Asignar jugador que exista y tenga todos sus campos v�lidos
	@Test
	void testSetJugadorValido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Alejandro";
		int edadValida = 20;
		String idiomaValido = "Espa�ol";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	//Asignar jugador que exista, pero su nombre sea inv�lido
	@Test
	void testSetJugadorNombreInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Eva";
		int edadValida = 20;
		String idiomaValido = "Espa�ol";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	//Asignar jugador que exista, pero no tenga nombre
	@Test
	void testSetJugadorNombreVacio() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "";
		int edadValida = 20;
		String idiomaValido = "Espa�ol";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	//Asignar jugador que exista, pero su edad sea inv�lida
	@Test
	void testSetJugadorEdadInvalida() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Alejandro";
		int edadValida = 0;
		String idiomaValido = "Espa�ol";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	//Asignar jugador que exista, pero no tenga edad
	@Test
	void testSetJugadorEdadNull() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Alejandro";
		
		String idiomaValido = "Espa�ol";
		jugador.setNombreJugador(nombrevalido);
		
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertNull(jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	//Asignar jugador que exista, pero su idioma sea inv�lido
	@Test
	void testSetJugadorIdiomaInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Alejandro";
		int edadValida = 20;
		String idiomaValido = "�rabe";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	//Asignar jugador que exista, pero no tenga idioma
	@Test
	void testSetJugadorIdiomaNull() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Alejandro";
		int edadValida = 20;
		String idiomaValido = "";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	/////////////////////////////////////////////////////////////////////////
	
	//Asignar equipo que exista y tenga todos los campos validos
		@Test
		void testAsignarEquipoCamposValidos() {

			AsignarEquipo asignarEquipo = new AsignarEquipo();
			Equipo equipo = new Equipo();
			String nombre= "PraiseTheSun";
			int ranking = 1;
			equipo.setNombreEquipo(nombre);
			equipo.setRanking(ranking);
			asignarEquipo.setEquipo(equipo);
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			assertEquals(nombre, equipoGuardado.getNombreEquipo());
			assertEquals(ranking, equipoGuardado.getRanking());
			assertNotNull(equipoGuardado);
		}

		//Asignar equipo que no exista (es decir nulo)
		@Test
		void testAsignarEquipoNulo() {
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			Equipo equipo = null;

			asignarEquipo.setEquipo(equipo);
			assertNull(asignarEquipo.getEquipo());
		}

		//Asignar equipo que exista pero que su nombre sea inv�lido
		@Test
		void testAsignarEquipoNombreInvalido() {
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			Equipo equipo = new Equipo();
			String nombre = "Sol";
			equipo.setNombreEquipo(nombre);
			asignarEquipo.setEquipo(equipo);
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			assertNull(equipoGuardado);
		}

		//Asignar equipo que exista pero que no tenga nombre
		@Test
		void testAsignarEquipoSinNombre() {
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			Equipo equipo = new Equipo();
			String nombre = null;
			equipo.setNombreEquipo(nombre);
			asignarEquipo.setEquipo(equipo);
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			assertNull(equipoGuardado);
		}

		//Asignar equipo que exista pero que tenga ranking inv�lido
		@Test
		void testAsignarEquipoRankingInv�lido() {
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			Equipo equipo = new Equipo();
			String nombre = "Tzedakah";
			int ranking= -1;
			equipo.setRanking(ranking);
			equipo.setNombreEquipo(nombre);
			asignarEquipo.setEquipo(equipo);
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			assertNull(equipoGuardado);
		}


		//Asignar equipo que exista pero que no tenga ranking
		@Test
		void testAsignarEquipoSinRanking() {
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			Equipo equipo = new Equipo();
			String nombre = "Overgeared";
			equipo.setNombreEquipo(nombre);
			asignarEquipo.setEquipo(equipo);
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			assertNull(equipoGuardado);
		}

}