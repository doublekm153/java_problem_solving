package chap_28;

public class BioCalendar {
  public static final int PHYSICAL = 23;
  public static void main(String[] args) {
    int index = PHYSICAL;
    int days = 1200;
    double phyval = 100 * Math.sin( (days % index) * 2 * Math.PI / index ); //4 * 2 * 3.14 / 23
    System.out.printf("나의 신체 지수는 %1$.2f입니다.\n", phyval);
    System.out.println(Math.sin(1));
  }
}
