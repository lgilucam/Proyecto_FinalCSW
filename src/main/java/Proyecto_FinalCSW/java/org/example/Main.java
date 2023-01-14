package Proyecto_FinalCSW.java.org.example;

public class Main {

  public static void main(String[] args) {
	//Result result = JUnitCore.runClasses(TestJunit.class); 
    //for (Failure failure : result.getFailures()) { 
       //System.out.println(failure.toString()); 
    //} 
    //System.out.println(result.wasSuccessful()); 

	
    
        boolean continuar = true;
        int lecturaProducto, lecturaCantidad; //Variables para seleccionar el producto y la cantidad que se quiere comprar

        //Se instancian y cargan los productos
        Producto disco1 = new Musica("Mayhem", 18.53, 6, true, "Black Metal");
        Producto disco2 = new Musica("Metallica", 21.2, 20, true, "Rock");
        Producto cine1 = new Cine("SAW", 30.2, 5, true, "James");
        Producto juego1 = new Games("Super Mario Bross", 35.11, 10, true, "Nintendo Switch");

        //Se crea el array "catálogo" para contener los productos. Su dimensión viene del número de veces que se
        //instancia el contructor de Producto
        Producto catalogo[] = new Producto[Producto.dimesionArray];
        //Se crea el objeto gestion para trabajar (mostrar y vender productos, y mostrar caja)
        Gestion gestion = new Gestion();

        //Se rellena el array catálogo
        catalogo[0] = disco1;
        catalogo[1] = disco2;
        catalogo[2] = cine1;
        catalogo[3] = juego1;

        do {
            System.out.println("Introduzca la opción que desea realizar: \n"
                    + "1. Mostrar productos \n"
                    + "2. Vender productos \n"
                    + "3. Mostrar caja \n"
                    + "SALIR --> Pulse cualquier otro número \n"
            );
            switch (Leer.datoInt()) {
                case 1:
                    gestion.mostrarProductos(catalogo);
                    break;
                case 2:
                    System.out.println("¿Que producto desea comprar?");
                    gestion.mostrarNombreProductos(catalogo);
                    lecturaProducto = Leer.datoInt();
                    System.out.println("¿Cuánta cantidad desea comprar?");
                    lecturaCantidad = Leer.datoInt();
                    //Se carga el producto y la cantidad solicitada por el usuario
                    gestion.comprarProducto(catalogo, lecturaProducto, lecturaCantidad);
                    break;
                case 3:
                    System.out.println(gestion.mostrarCaja() + " €");
                    break;
                default:
                    //Se sale del programa
                    continuar = false;
            }

        } while (continuar);
          System.out.println("---- Gracias por usar la aplicación. ----");

      
        }
}