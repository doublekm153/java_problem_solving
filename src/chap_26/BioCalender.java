package chap_26;

public class BioCalender {
  public static final int PHYSICAL = 23;
  public static void main(String[] args) {
    System.out.println(PHYSICAL);
    int index = PHYSICAL;
    double val = 2 * Math.PI / index;
    System.out.println(val + "라디안");
  }
}
