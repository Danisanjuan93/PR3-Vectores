package muestraresultados;

public class CalculadorEstadisticas {
    
    
    public static DatosEstadisticos[] estadisticaOrdenaVector(OrdenarVector m, int tam_vector){
        DatosEstadisticos datos[] = new DatosEstadisticos[2];
        //DatosEstadisticos para un vector inverso
        DatosEstadisticos estadisticos = new DatosEstadisticos();
        int[] vector;
        vector = GeneraCaso.generaVector(tam_vector,false);
        float start = System.currentTimeMillis();
        m.ordena(vector, estadisticos);
        float end = System.currentTimeMillis();
        end = (end - start)/1000;
        datos[0].estableceTiempo(end);
        return datos;
        
    }
    public static DatosEstadisticos[][]estadisticasOrdenaVectores(OrdenarVector m, int[] tam_vectores){
        return null;
        
    }
}
