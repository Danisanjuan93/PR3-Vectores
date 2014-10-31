package muestraresultados;

public class MuestraResultados {

    public static void main(String[] args) {
        int[] vector = GeneraCaso.generaVector(10, true);
        DatosEstadisticos datosEstadisticos = new DatosEstadisticos();
        OrdenaVector1 ordenado = new OrdenaVector1();
        ordenado.ordena(vector, datosEstadisticos);
        
    }
    
}
