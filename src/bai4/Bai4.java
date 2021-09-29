
package bai4;

import java.util.Scanner;
public class Bai4 {

    
    public static void main(String[] args) {
      int a,b;
      Scanner scanner = new Scanner(System.in);
      System.out.print("nhap vao mot so:");
      a = scanner.nextInt();
      b=a%7;
      switch(b){
          case 1:
          System.out.print("Sunday");
          break;
          case 2:
              System.out.print("Monday");
          break;
          case 3:
              System.out.print("Tuesday");
           break;
          case 4:
              System.out.print(" Wednesday");
            break;
          case 5:
              System.out.print("Thursday");
             break;
          case 6:
              System.out.print(" Friday");
              break;
          case 7:
              System.out.print("Saturday");
              break;
           
          
      }
              
    }
    
}
