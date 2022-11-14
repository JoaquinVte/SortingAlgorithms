public class QuickSort {
    public static void sort(int[] v,int left,int right){

        int pivot = v[(left+right)/2];
        int r = right;
        int l = left;

        do{
            while (v[right]>pivot)
                right--;
            while (v[left]<pivot)
                left++;

            if(left<=right) {
                Tool.intercambiar(v, left, right);
                left++;
                right--;
            }
        }while(left<right);

        if(left<r)
            sort(v,left,r);
        if(right>l)
            sort(v,l,right);

    }
}
