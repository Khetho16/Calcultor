import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number below 10 that is a multiple of 3 or 5  :  ");
        int num = input.nextInt();

        if (num < 10){
            int[] arr = {1,2,3,4,5,6,7,8,9};
            int sum = arr[2]+arr[4]+arr[5]+arr[8];
            System.out.print("The sum is " +sum);
        }else{
            System.out.print("Number above 10");
        }


    }

    public static boolean hasThree(boolean natural, int num1, int num2 ){
        if ((num1 == 3)){
            int sum = num1 + num2;
            natural = true;
        }
        else
        {
            natural = false;
        }

        return natural;
    }
}
