package muestraresultados;

public class CalculadorEstadisticas {
    
    public static DatosEstadisticos[] estadisticaOrdenaVector(OrdenarVector m, int tam_vector){
        //Vector para guardar el tiempo de ejecución
        DatosEstadisticos datos[] = new DatosEstadisticos[2];
        
        //DatosEstadisticos para un vector inverso
        DatosEstadisticos estadisticos = new DatosEstadisticos();
        int[] vector = GeneraCaso.generaVector(tam_vector,false);
        float start = System.currentTimeMillis();
        m.ordena(vector, estadisticos);
        float end = (System.currentTimeMillis() - start)/1000;
        datos[0].estableceTiempo(end);
        
        //DatosEstadisticos para 10 vectores ordenados aleatoriamente
        start = System.currentTimeMillis();
        for (int i = 0; i < vector.length; i++) {
            vector = GeneraCaso.generaVector(tam_vector,true);
            m.ordena(vector, estadisticos);
        }
        end = (System.currentTimeMillis() - start)/1000;
        datos[1].estableceTiempo(end);
        
        //Devolvemos el vector
        return datos;
        
    }
    public static DatosEstadisticos[][]estadisticasOrdenaVectores(OrdenarVector m, int[] tam_vectores){
        //Creamos el vector de vectores (Matriz)
        DatosEstadisticos datosEstadisticos[][] = new DatosEstadisticos[tam_vectores.length][2];
        
        for (int i = 0; i < tam_vectores.length; i++) {
            DatosEstadisticos datos[] = estadisticaOrdenaVector(m, tam_vectores[i]);
            datosEstadisticos[i][0] = datos[0];
            datosEstadisticos[0][i] = datos[1];
        }
        
        return datosEstadisticos;
        
    }
}
