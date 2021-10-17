import java.util.Scanner;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    System.out.println("enter Command");

    Calculator calculator=new Calculator();

    while (true) {
      Scanner my_scan=new Scanner(System.in);
      String my_str=my_scan.next();

      if (my_str.equals("add")) {
        int a=Integer.parseInt(my_scan.next());
        int b=Integer.parseInt(my_scan.next());
        System.out.println(calculator.add(a, b));
      }
      if (my_str.equals("subtract")) {
        int a=Integer.parseInt(my_scan.next());
        int b=Integer.parseInt(my_scan.next());
        System.out.println(calculator.subtract(a, b));
      }
      if (my_str.equals("multiply")) {
        int a=Integer.parseInt(my_scan.next());
        int b=Integer.parseInt(my_scan.next());
        System.out.println(calculator.multiply(a, b));
      }
      if (my_str.equals("divide")) {
        int a=Integer.parseInt(my_scan.next());
        int b=Integer.parseInt(my_scan.next());
        System.out.println(calculator.divide(a, b));
      }
      if (my_str.equals("fib")) {
        int n=Integer.parseInt(my_scan.next());
        System.out.println(calculator.fibonacciNumberFinder(n));
      }
      if (my_str.equals("binary")) {
        int n=Integer.parseInt(my_scan.next());
        System.out.println(calculator.intToBinaryNumber(n));
      }

    }
  }

}
