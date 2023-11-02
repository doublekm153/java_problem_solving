package chap_23;

public class Letters {
  public static void main(String[] args) {
    char a = '닳';
    String letter = "동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
    int letterNumber = letter.length(); //36
    System.out.println(letterNumber);
//    indexOf() 메소드는 문자열에서 특정 문자나 문자열이 처음으로 등장하는 위치를 반환한다.
    int loc = letter.indexOf(a);
    System.out.println(loc);
    System.out.printf("\"%s\" => %d자이며, '%c' 은 %d 번째 있다.\n", letter, letterNumber, a, loc);
    char b = letter.charAt(loc);
//    charAt() 메소드는 문자열에서 특정 위치에 있는 문자를 반환한다.
    System.out.println(b);
    System.out.printf("\"%s\"의 %d 번째 문자는 '%c' 이다.", letter, loc, b);
  }
}