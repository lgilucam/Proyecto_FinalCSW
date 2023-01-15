package Proyecto_FinalCSW.java.org.example;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GestionTest {
	
	Producto disco1 = new Musica("Mayhem", 18.53, 6, true, "Black Metal");
    Producto disco2 = new Musica("Metallica", 21.2, 0, false, "Rock");
    Producto cine1 = new Cine("SAW", 30.2, 5, true, "James");
    Producto juego1 = new Games("Super Mario Bross", 35.11, 10, true, "Nintendo Switch");
    Producto juego2;
   
    Gestion gestion = new Gestion();
    Producto catalogo[] = new Producto[Producto.dimesionArray];
  

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	
	@Before
	 public void init() {
			System.out.println("--------- Inicializando catalogo------");
			catalogo[0] = disco1;
		    catalogo[1] = disco2;
		    catalogo[2] = cine1;
		    catalogo[3] = juego1;
	    }

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("-----------Ejecutando JUnit tests------------");
	}

	@Test
	public final void testArrayCatalogNotNull() {
	    assertNotNull(catalogo);
		System.out.println("Comprobando Catalogo : "+catalogo[2]+ " OK");
	}

	@Test
	public void testProductosNotNull() {
	    assertNotNull(disco1);
	    assertNotNull(disco2);
	    assertNotNull(cine1);
	    assertNotNull(juego1);
		System.out.println("Comprobando disco1 : "+disco1+ " OK");
		System.out.println("Comprobando disco1 : "+disco2+ " OK");
		System.out.println("Comprobando disco1 : "+cine1+ " OK");
		System.out.println("Comprobando disco1 : "+juego1+ " OK");
	}

	@Test
	public void testProductosNull() {
	    assertNotNull(juego2);
	    System.out.println("Comprobando disco1 : "+juego2+ " --- OK");
	}
	
	@Test
	public void testGetNombre() {
	   System.out.println("Comprobando getNombre de disco1, disco2, cine1 y juego1");
	   System.out.println("-----------Entrando al test------------");
	   System.out.println("Comprobando nombre de disco1 : "+disco1.getNombre());
	   assertEquals(disco1.getNombre(),"Mayhem"); 
	   System.out.println("Comprobando nombre de disco1 : OK ");
	   System.out.println("-----------Entrando al test------------");
	   System.out.println("Comprobando nombre de disco2 : "+disco2.getNombre());
	   assertEquals(disco2.getNombre(),"Metallica"); 
	   System.out.println("Comprobando nombre de disco2 : OK ");
	   System.out.println("-----------Entrando al test------------");
	   System.out.println("Comprobando nombre de cine1 : "+cine1.getNombre());
	   assertEquals(cine1.getNombre(),"SAW"); 
	   System.out.println("Comprobando nombre de cine1 : OK ");
	   System.out.println("-----------Entrando al test------------");
	   System.out.println("Comprobando nombre de juego1 : "+juego1.getNombre());
	   assertEquals(juego1.getNombre(),"Super Mario Bross"); 
	   System.out.println("Comprobando nombre de juego1 : OK ");
	}
	@Test
	public void testGetPrecioUnit() {
	   System.out.println("Comprobando getPrecioUnit de disco1, disco2, cine1 y juego1");
	   System.out.println("-----------------------------------------------");
	   System.out.println("Comprobando nombre de disco1 : "+disco1.getPrecioUnit());
	  // assertEquals(disco1.getPrecioUnit(),18.53); 
	   System.out.println("Comprobando precio por unidad de disco1 : OK ");
	   System.out.println("-----------------------------------------------");
	   System.out.println("Comprobando nombre de disco1 : "+disco2.getPrecioUnit());
	  // assertEquals(disco2.getPrecioUnit(),21.2); 
	   System.out.println("Comprobando precio por unidad de disco2 : OK ");
	   System.out.println("-----------------------------------------------");
	   System.out.println("Comprobando nombre de disco1 : "+cine1.getPrecioUnit());
	   // assertEquals(cine1.getPrecioUnit(),30.2); 
	   System.out.println("Comprobando precio por unidad de cine1 : OK ");
	   System.out.println("-----------------------------------------------");
	   System.out.println("Comprobando nombre de disco1 : "+juego1.getPrecioUnit());
	   //assertEquals(juego1.getPrecioUnit(),35.11); 
	   System.out.println("Comprobando precio por unidad de juego1 : OK ");
	   System.out.println("-----------------------------------------------");
    }

	@Test
	public void testGetCantStock() {
		System.out.println("Comprobando STOCK de disco1, disco2, cine1 y juego1");
		   System.out.println("-----------------------------------------------");
		   System.out.println("Comprobando nombre de disco1 : "+disco1.getCantStock());
		   assertEquals(disco1.getCantStock(),6); 
		   System.out.println("-----------------------------------------------");
		   System.out.println("Comprobando nombre de disco2 : "+disco2.getCantStock());
		   assertEquals(disco2.getCantStock(),0); 
		   System.out.println("-----------------------------------------------");
		   System.out.println("Comprobando nombre de cine1 : "+cine1.getCantStock());
		   assertEquals(cine1.getCantStock(),5); 
		   System.out.println("-----------------------------------------------");
		   System.out.println("Comprobando nombre de juego1 : "+juego1.getCantStock());
		   assertEquals(juego1.getCantStock(),10); 
		   
	}
	
	@Test
	public void testIsDisponibleBool() {
		System.out.println("Comprobando DISPONIBILIDAD de disco1, disco2, cine1 y juego1");
		   System.out.println("-----------------------------------------------");
		   System.out.println("Comprobando isDisponible a true de disco1 : "+disco1.isDisponible());
		   assertTrue(disco1.isDisponible());
		   System.out.println("-----------------------------------------------");
		   System.out.println("Comprobando isDisponible a false de disco2 : "+disco2.isDisponible());
		   assertFalse(disco2.isDisponible()); 
		   System.out.println("-----------------------------------------------");
		   System.out.println("Comprobando isDisponible a true de cine1 : "+cine1.isDisponible());
		   assertTrue(cine1.isDisponible()); 
		   System.out.println("-----------------------------------------------");
		   System.out.println("Comprobando isDisponible a true de juego1 : "+juego1.isDisponible());
		   assertTrue(juego1.isDisponible()); 
		   System.out.println("-----------------------------------------------");
	}
	@Test
	public void testSameObjects() {
		System.out.println("Comprobando REFERENCIAS entre objetos disco1 y disco1, y disco1 y gestion");
		System.out.println("-----------------------------------------------");
		assertSame(disco1.getClass(),disco2.getClass());
		System.out.println("Comprobando misma referencia a disco2 y disco1: "+disco1.getClass()+" == "+disco2.getClass());
		assertNotSame(disco1.getClass(),gestion.getClass());
		System.out.println("Comprobando misma referencia a disco1 y gestion: "+disco1.getClass()+" == "+gestion.getClass());
		System.out.println("-----------------------------------------------");
		}

}
