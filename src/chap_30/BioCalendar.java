package chap_30;

public class BioCalendar {
  public static final int PHYSICAL = 23;
//  멤버 메서드 사용 (static x)
  public double getBioRhythm(long days, int index, int max) {
    return max * Math.sin( (days % index) * 2 * Math.PI / index );
  }
  public static void main(String[] args) {
    int days = 1200;
    BioCalendar bio = new BioCalendar();
//    메서드 호출
    double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
    System.out.printf("나의 신체 지수는 %1$.2f입니다.\n", phyval);
  }
}
