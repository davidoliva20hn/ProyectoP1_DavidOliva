/*
 */
package pokedex;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class PokedexRegistro {
    private String nombre;
    private String tipo;
    private String region;
    private int vida;

    public PokedexRegistro (String Nombre, String Tipo, String Region, int Vida) {
        this.nombre = Nombre;
        this.region = Region;
        this.tipo = Tipo;
        this.vida = Vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    

} 
