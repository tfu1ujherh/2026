import java.util.*;
class  Count_all_Digits_of_a_Number{
    public static void main(String[]args){
         
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number:");

        int num=sc.nextInt();
        System.out.println("Number of digits:"+ solve(num) );



    }

    public static int solve(int num){
        int count=0;

        while(num!=0){
            count++;
            num/=10;
        }
        return  count;
    }
}