package chap_29;

public class BioCalendar {
  public static final int PHYSICAL = 23;
  
//  static 메서드 선언
  public static double getBioRhythm(long days, int index, int max) {
    return max * Math.sin( (days % index) * 2 * Math.PI / index );
  }
  public static void main(String[] args) {
    int days = 1200;
//    메서드 호출
    double phyval = getBioRhythm(days, PHYSICAL, 100);
    System.out.printf("나의 신체 지수는 %1$.2f입니다.\n", phyval);
  }
}
