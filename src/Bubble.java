public class Bubble {
    public static void sort(int[] v) {

        for (int j = 0; j < v.length - 1; j++)
            for (int i = 0; i < v.length - 1; i++) {
                if (v[i] > v[i + 1])
                    Tool.intercambiar(v, i, i + 1);
            }


    }



}
