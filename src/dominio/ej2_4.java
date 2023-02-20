package dominio;

public class ej2_4 {




    public static int sumalista( int[] lista,int i) {
        if(i==0) {
            return lista[0];
        }else {
            return lista[i]+sumalista(lista,i-1);


        }
    }

    public static int sumaMem(int[]T,int i,int s) {
        if(i==-1) {
            return s;
        }else {
            return sumaMem(T,i-1,s+T[i]);
        }
    }



}

