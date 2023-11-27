import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     // Taking input as array size
        System.out.println("Enter the size of the array:");
        int n=scanner.nextInt();
        int[] numbers=new int[n];
    // Taking input: array elements
        System.out.println("Enter elemnts of the array:");
        for(int i=0;i<n;i++){
            numbers[i]=scanner.nextInt();
        }
    // using 'for' Loop to calculate sum
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        System.out.println("Sum of elemnts in array:"+sum);
    // using 'while' loop to calculate product
       int product=1;
       int i=0;
       while(i<n){
        product*=numbers[i];
        i++;
       }
        System.out.println("product of elemnts of the array:"+product);
    // using 'do-while' loop to calculate factorial
       int factorial=1;
       int j=0;
       do{
        factorial*=numbers[j];
        j++;
       } while(j<n);
        System.out.println("factorial  of the numbers:"+factorial);


        
    }
}
