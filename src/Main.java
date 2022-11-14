import com.sun.scenario.effect.Merge;

public class Main {
    public static void main(String[] args) {

        //int[] sizes = {500,1000,10000,20000,30000,40000,50000,60000,70000,80000,90000,100000,110000,120000,130000,140000,150000,160000,170000,180000,190000,200000};
        int[] sizes = {2000000};
        int[] v;
        long start, end;

        for(int size : sizes) {
            v = new int[size];
            Tool.rellenar(v);
            //Tool.mostrar(v);
            start = System.currentTimeMillis();
            //Bubble.sort(v);
            MergeSort.sort(v,0,v.length);
            end = System.currentTimeMillis();
            //Tool.mostrar(v);

            System.out.println("Size: " + size +" Time:" + (end - start) + " ms " );
        }
    }



}