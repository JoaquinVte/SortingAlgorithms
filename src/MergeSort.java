public class MergeSort {

    public static void sort(int[] v, int start,int longitud){
        int longitud1,longitud2;

        if(longitud>1){
            longitud1=longitud/2;
            longitud2=longitud-longitud1;
            sort(v,start,longitud1);
            sort(v,start+longitud1,longitud2);
            merge(v,start,longitud1,longitud2);
        }
    }

    private static void merge(int[] v, int start, int longitud1, int longitud2) {

        int[] aux = new int[longitud1+longitud2];
        int i=0,j=0,k=0;

        while (i<longitud1 && j<longitud2){
            if(v[start+i]<v[start+longitud1+j])
                aux[k++]=v[start+i++];
            else
                aux[k++]=v[start+longitud1+j++];
        }

        while(i<longitud1)
            aux[k++]=v[start+i++];
        while (j<longitud2)
            aux[k++]=v[start+longitud1+j++];

        for(int l=0;l<aux.length;l++){
            v[start+l]=aux[l];
        }

    }
}
