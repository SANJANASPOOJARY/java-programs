import java.util.Arrays;

public class SprintResults2 {
    public static void main(String[] args){
        double[] times={12.5,11.8,13.0,12.2,11.5};
        System.out.println("Initial sprint times:"+ Arrays.toString(times));
        System.out.println();
        bubbleSort(times);
    }
    public static void bubbleSort(double[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    double temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            System.out.println("After pass"+(i+1)+":"+Arrays.toString(arr));
            if(!swapped) break;
        }
        System.out.println("\nFinal sorted results(fastest to slowest):"+Arrays.toString(arr));
        System.out.println("Time Complexity:O(n^2)");
    }
}
