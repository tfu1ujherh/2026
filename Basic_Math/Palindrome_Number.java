import java.util.*;
public class Palindrome_Number {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number:");

        int num=sc.nextInt();

        System.out.println("Is palindrome:"+solve(num));


    }

    public static boolean  solve(int num){
        if(num<0){
            return  false;
        }
        int temp=num;

        int rev_num=0;

        while(num!=0){
            int digit=num%10;
            rev_num=rev_num*10+digit;
            num/=10;
        }

        if(temp==rev_num){
            return true;
        }

        return  false;
    }
}
