public class Tool {
    public static void rellenar(int[] v) {
        for (int i = 0; i < v.length; i++)
            v[i] = (int) (Math.random() * 1000);
    }

    public static void mostrar(int[] v) {
        for (int num : v)
            System.out.print(num + " ");
        System.out.println();
    }
    public static void intercambiar(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}
