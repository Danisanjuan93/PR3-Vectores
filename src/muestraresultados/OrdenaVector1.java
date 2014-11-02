package muestraresultados;

public class OrdenaVector1 {
    public String name;

    public OrdenaVector1(String name) {
        this.name = name;
    }
   
    public String nombreMetodo (){
        return this.name;
    }
    
    public void ordena(int[] v, DatosEstadisticos de){
        int menor;
        int pos = 0;
        for (int i = 0; i < v.length; i++) {
            menor = v[i];
            for (int j = 0; j < v.length; j++) {
                if(v[j] < menor){
                    menor = v[j];
                    pos = j;
                }
            }
            v[pos] = v[i];
            v[i] = menor;
        }
    }
}