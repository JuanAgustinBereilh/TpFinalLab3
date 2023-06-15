package Modelo;

public class Proveedores {

    private String cuit;
    private String nombre;
    private String direccion;
    private String telefono;

    public Proveedores () {

    }

    // CONSTRUCTOR
    public Proveedores(String cuit, String nombre, String direccion, String telefono) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // GETTERS AND SETTERS
    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
