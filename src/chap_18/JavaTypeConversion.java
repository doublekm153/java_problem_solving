package chap_18;

public class JavaTypeConversion {
    public static void main(String[] args) {
        String slat = "37.52127220511242";
//      String slat = "hello";
//      trim() == 문자열의 앞뒤 공백을 제거해주는 메소드
//      Double.parseDouble() 메소드 == 문자열을 double 형태로 변환해주는 메소드
        double latitude = Double.parseDouble(slat.trim());
        System.out.println(latitude);
    }
}
