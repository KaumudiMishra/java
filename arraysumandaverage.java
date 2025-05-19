public class arraysumandaverage {
   public static void main(String[] args) {
    int[] arr = new int[5];
    arr = new int[]{10,20,30,40,50};
    int sum  = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    System.out.println("sum = "+sum);
    System.out.println("average = "+sum/arr.length);
   } 
}
