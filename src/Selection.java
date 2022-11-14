public class Selection {
    public static void sort(int[] v){

        int posMenor,pos;
        for(int j=0;j<v.length-1;j++) {
            posMenor = j;
            pos = j;
            for (int i = j+1; i < v.length; i++) {
                if (v[i] < v[posMenor])
                    posMenor = i;
            }
            Tool.intercambiar(v, pos, posMenor);
        }



    }


}
