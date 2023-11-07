package chap_31;

public class FruitMain {
  public static void main(String[] args) {
    FRUIT pear = FRUIT.APPLE; //FRUIT 타입 pear 변수에 enum 값 대입. enum 값은 상수이므로 대문자로 표기
    FRUIT pear2 = FRUIT.MANGO;
    System.out.println(pear);
    System.out.println(pear.name());
    System.out.println(pear.ordinal());
    System.out.println(pear2.ordinal());
    FRUIT [] fruits = FRUIT.values();
    System.out.println(fruits[0]);
  }
}
