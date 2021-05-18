package chapter2;

import java.util.*;

public class Beakjun{
    
    public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.print("입력하세요. : ");
   int A;
   A = sc.nextInt();
   
   System.out.print("입력하세요. : ");
   
   String B = sc.next();
   
   sc.close();
   
   System.out.println(A*(B.charAt(0)-'0'));
   System.out.println(A*(B.charAt(1)-'0'));
   System.out.println(A*(B.charAt(2)-'0'));
   System.out.println(A*Integer.parseInt(B));

    }
}