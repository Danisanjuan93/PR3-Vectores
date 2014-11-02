package muestraresultados;

public class DatosEstadisticos {
    private float tiempo;
    public DatosEstadisticos() {
    }
    
    public void añadeTiempo(float segundos){
        tiempo += segundos;
    }
    
    public void estableceTiempo(float tiempo){
        this.tiempo = tiempo;
    }
    
    public float dameTiempo(){
        return this.tiempo;
    }
}