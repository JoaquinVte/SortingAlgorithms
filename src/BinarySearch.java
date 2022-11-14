public class BinarySearch {

    public static void main(String[] args) {

        int[] num = {2, 6, 7, 1, 0, 9, 8, 10,15};

        QuickSort.sort(num, 0, num.length - 1);

        Tool.mostrar(num);

        System.out.println(binarySearch(num,10,0,num.length-1));

    }

    private static int binarySearch(int[] num, int n, int left, int right) {

        int medio = (left + right) / 2;

        if (n == num[medio])
            return medio;
        if (right < left)
            return -1;

        if (num[medio] < n)
            return binarySearch(num, n, medio + 1, right);
        else
            return binarySearch(num,n,left,medio-1);
    }

}
