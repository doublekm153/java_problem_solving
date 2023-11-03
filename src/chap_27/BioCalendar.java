package chap_27;

public class BioCalendar {
  public static final int PHYSICAL = 23;
  public static void main(String[] args) {
    int index = PHYSICAL;
    int days = 1200;
    System.out.println(32%3);
    System.out.println(days % index);
    System.out.println(days / index);
    double val = (days % index) * 2 * Math.PI / index;
    System.out.println(Math.toDegrees(val) + "도");
//    Math.toDegrees() == 라디안 -> 각도 변환
  }
}
