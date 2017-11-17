
import java.util.ArrayList;


public class Equipo {
    private String nombre,estadio;
    private double presupuesto;
    private int copas,bandera;
    ArrayList<Jugador> listaJugadores = new ArrayList();;

    public Equipo(String nombre, String estadio, double presupuesto, int copas) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.presupuesto = presupuesto;
        this.copas = copas;
        this.bandera = 0;
    }

    @Override
    public String toString() {
        if(bandera==0)
            return nombre + "| Copas: "+copas;
        else
            return nombre;
    }
    
    
    
    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public int getCopas() {
        return copas;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void setCopas(int copas) {
        this.copas = copas;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }
    
    
}
