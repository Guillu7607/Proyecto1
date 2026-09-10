import java.util.ArrayList;
import java.util.Arrays;

public class Dispositivo {
    protected String marca;
    protected double almacenamientoTotal;
    protected double almacenamientoDisponible;
    protected ArrayList<Aplicacion> appsInstaladas;
    public Dispositivo(String marca, double almacenamientoTotal, double almacenamientoDisponible, ArrayList<Aplicacion> appsInstaladas) {
        this.marca = marca;
        this.almacenamientoTotal = almacenamientoTotal;
        this.almacenamientoDisponible = almacenamientoDisponible;
        this.appsInstaladas = appsInstaladas;
    }

    public boolean instalarapp(Aplicacion app) {
        boolean disponible;
        disponible = almacenamientoDisponible > 0;
        return disponible;
    }
    public boolean desinstalarApp (String nombreApp){

    }
    public ArrayList<String> listadoapps(){

    }
    public void mostrarappsinstaladas(){
    }
    public String informacionApp (String  nombreApp){

    }
    public double obteneralmacenamientodisponible(){
        return  almacenamientoDisponible;
    }
}
