package Proyecto_FinalCSW.java.org.example;

public class Musica extends Producto {

    //Attribute
	public String genero;


    //Constructor
    public Musica() {
    }

    public Musica(String nombre, double precioUnit, int cantStock, boolean disponible, String genero) {
        super(nombre, precioUnit, cantStock, disponible);
        this.genero = genero;
    }


    //Methods
    @Override
    public String toString() {
        return "GENERO MUSICAL: \n" +
                super.toString() +
                "Genero: " + this.genero;
    }

    //Gets and Sets
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
