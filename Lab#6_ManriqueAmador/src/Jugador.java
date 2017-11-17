
public class Jugador {
    
    private String nombre,posicion;
    private double precio;
    private boolean disponibilidad;
    private int habilidad,tecnica,resistencia,bandera;

    public Jugador(String nombre, String posicion, double precio, boolean disponibilidad, int habilidad, int tecnica, int resistencia) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
        this.habilidad = habilidad;
        this.tecnica = tecnica;
        this.resistencia = resistencia;
        this.bandera = 0;
    }
    @Override
    public String toString() {
        if(bandera == 0){
        return nombre + " | Precio: "+precio+" | Posicion: "+posicion + " | Disp: " + Valor(disponibilidad);
        }
        else{
            return nombre + " ("+posicion+")";
        }
    }

    public void setBandera(int bandera) {
        this.bandera = bandera;
    }
    
    public String Valor(Boolean b){
        if(b){
            return "SI";
        }else{
            return "NO";
        }
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }

    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    
    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public int getTecnica() {
        return tecnica;
    }

    public int getResistencia() {
        return resistencia;
    }
    
    
}
