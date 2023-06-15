package Modelo;

public class Ajustes {
    private int id_sucursal;
    private String cuit_sucursal;
    private String nom_sucursal;
    private String telf_sucursal;
    private String direc_sucursal;
    private String mensaje_sucursal;

    public Ajustes () {

    }

    // CONSTRUCTOR
    public Ajustes(int id_sucursal, String cuit_sucursal, String nom_sucursal, String telf_sucursal, String direc_sucursal, String mensaje_sucursal) {
        this.id_sucursal = id_sucursal;
        this.cuit_sucursal = cuit_sucursal;
        this.nom_sucursal = nom_sucursal;
        this.telf_sucursal = telf_sucursal;
        this.direc_sucursal = direc_sucursal;
        this.mensaje_sucursal = mensaje_sucursal;
    }

    // GETTERS AND SETTERS

    public int getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public String getCuit_sucursal() {
        return cuit_sucursal;
    }

    public void setCuit_sucursal(String cuit_sucursal) {
        this.cuit_sucursal = cuit_sucursal;
    }

    public String getNom_sucursal() {
        return nom_sucursal;
    }

    public void setNom_sucursal(String nom_sucursal) {
        this.nom_sucursal = nom_sucursal;
    }

    public String getTelf_sucursal() {
        return telf_sucursal;
    }

    public void setTelf_sucursal(String telf_sucursal) {
        this.telf_sucursal = telf_sucursal;
    }

    public String getDirec_sucursal() {
        return direc_sucursal;
    }

    public void setDirec_sucursal(String direc_sucursal) {
        this.direc_sucursal = direc_sucursal;
    }

    public String getMensaje_sucursal() {
        return mensaje_sucursal;
    }

    public void setMensaje_sucursal(String mensaje_sucursal) {
        this.mensaje_sucursal = mensaje_sucursal;
    }
}
