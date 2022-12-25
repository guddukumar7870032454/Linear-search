public class Kadane {
    public static void PrintMaxSubArray(int number[]){
        int cs= 0;
        int max = 0;
        int sum = 0;
        int n = number.length;

        // calculating max sub array sum  array = {1,2,3,4,5,6}
        for(int i=0;i<n;i++){
            currsum = currsum +number[i];
            if(currsum <= 0){
                currsum = 0;
            }
            max = Math.max(curr,number[i]);
            }
            System.out.print("Total sub array Sum :" + max);
        }
public static void main(Strings args[]){
int number[] = {1,2,3,4,5,6};
    PrintMaxArray(number);
}
 }

