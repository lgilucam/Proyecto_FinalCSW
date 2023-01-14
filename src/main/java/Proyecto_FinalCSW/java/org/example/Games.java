package Proyecto_FinalCSW.java.org.example;

public class Games extends Producto {

    //Attribute
    private String platform;


    //Constructor
    public Games() {
    }

    public Games(String nombre, double precioUnit, int cantStock, boolean disponible, String platform) {
        super(nombre, precioUnit, cantStock, disponible);
        this.platform = platform;
    }


    //Methods
    @Override
    public String toString() {
        return "PLATFORMn" +
                super.toString() +
                "platform: " + this.platform;
    }

    //Gets and Sets
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
