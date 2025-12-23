package co.edu.unicauca.lab4_mvc_paises.modelo;

/**
 *
 * @author fadav
 */
public class clsPais {
    
    private int idpais;
    private String nombre;
    private String capital;

    public clsPais() { }

    public clsPais(int idpais, String nombre, String capital) {
        this.idpais = idpais;
        this.nombre = nombre;
        this.capital = capital;
    }

    public int getIdpais() {
        return idpais;
    }

    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
