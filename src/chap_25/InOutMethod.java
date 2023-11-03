package chap_25;
import java.util.Scanner;
public class InOutMethod {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("정수를 입력하세요.");
    int choice = sc.nextInt();
    System.out.println(choice);
    
    System.out.println("실수를 입력하세요.");
    double choice2 = sc.nextDouble();
    System.out.println(choice2);
    
    System.out.println("문자열을 입력하세요.");
    String choice3 = sc.next();
    System.out.println(choice3);
  }
}
