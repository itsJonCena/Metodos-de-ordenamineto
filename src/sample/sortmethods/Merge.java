package sample.sortmethods;

/**
 * Created by Alex on 16/01/16.
 */
public class Merge {

    private int iteracciones = 0;

    public int[] merge_sort(int[] arreglo) {
        //Si lista esta vacía o de tamaño 1 ya está ordenada. Se devuelve lista tal cual
        if (arreglo.length <= 1) {
            return arreglo;
        } else {
            int medio = arreglo.length / 2;
            //Se crean dos arreglos para almacenar
            int[] tempA = new int[medio];
            int[] tempB = new int[arreglo.length - medio];
            int index = 0;
            for (int i = 0; i < arreglo.length; i++) {
                if (i < medio) {
                    tempA[i] = arreglo[i];
                } else {
                    tempB[index++] = arreglo[i];
                }
            }
            int[] izq = merge_sort(tempA);
            int[] der = merge_sort(tempB);
            return merge(izq, der);
        }
    }

    private int[] merge(int[] izq, int[] der) {
        int i = 0; //indice izq
        int j = 0; //indece der
        int index = 0;
        int[] resultado = new int[izq.length + der.length];

        while (i < izq.length && j < der.length) {
            if (izq[i] < der[j]) {
                resultado[index++] = izq[i++];
                //i++;
            }
            else {
                resultado[index++] = der[j++];
            }
            iteracciones++;
        }
        while (i < izq.length) {    // Copia el resto de la mitad izq
            resultado[index++] = izq[i++];
            iteracciones++;


        }while( j<der.length){ //Copia el resto de la mitad der
            resultado[ index++] = der[ j++ ];
            iteracciones++;

        }
        /*
        * Solo para comprobar si se ordeno =D
        * */
        System.out.println("Mergesort");
        for (int a:resultado) {
            System.out.println(a);
        }
        /* */

        return resultado;

    }
}
