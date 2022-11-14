public class Insertion {
    public static void sort(int[] v){
        int buffer;
        int i,j,k;
        for(i = 1; i < v.length; i++){
            j=0;
            buffer=v[i];

            // Avanzamos por el arreglo hasta encontrar la posicion donde colocar el valor de buffer
            while (v[j]<buffer){
                j++;
            }

            // Comprobamos si su posicion no es la ultima de la parte ordenada
            if(j<i){
                // Movemos todos los valores a la derecha de la posicion un puesto a la derecha.
                for (k=i;k>j;k--){
                    Tool.intercambiar(v,k,k-1);
                }
            }
        }
    }

}
