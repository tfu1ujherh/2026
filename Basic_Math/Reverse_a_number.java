import java.util.*;
public class Reverse_a_number {
    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number:");

        int num=sc.nextInt();

        System.out.println("Reverse number:"+solve(num));


    }

    public static int solve(int num){

        int rev_num=0;

        while(num!=0){
            int digit=num%10;
            rev_num=digit+rev_num*10;
            num/=10;
        }

        return rev_num;
    }
    
}
