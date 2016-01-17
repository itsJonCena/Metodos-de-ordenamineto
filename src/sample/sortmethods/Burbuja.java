package sample.sortmethods;

/**
 * Created by Alex on 16/01/16.
 */
public class Burbuja {
    /*
    * Posibles variables de para medir la complegidad
    * */

    public void Bubblesort(int matriz[]){

        int buffer;
        int i,j;
        for (i=0; i < matriz.length;i++){
            for (j=0; j < i;j++){
                if (matriz[i] < matriz[j]){
                    buffer = matriz[j];
                    matriz[j] = matriz[i];
                    matriz[i] = buffer;
                }
            }
        }

        /*
        System.out.println("Burbuja sort");
        for (int a:matriz) {
            System.out.println(a);
        }*/
    }
}
