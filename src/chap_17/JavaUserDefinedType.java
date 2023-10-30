package chap_17;

class JLocation {
    public double lat;
    public double lng;
}
public class JavaUserDefinedType {
    public static void main(String[] args) {
//        두 개의 기본 타입 생성
        double latitude = 37.52127220511242;
        double longitude = 127.0074462890625;

        /* 사용자 정의 객체 생성
        * JLocation 클래스에서 new JLocation 을 통해
        * JLocation 의 이름을 가진 생성자 생성.
        * jloc == JLocation 클래스에서 JLocation 이름의 객체를 호출함으로 인해 사용가능한 변수 이름.
        */
        JLocation jloc = new JLocation();
        jloc.lat= latitude;    //jloc.lat = 37.52127220511242;
        jloc.lng= longitude;    //jloc.lng = 127.0074462890625;

        JLocation newLoc = jloc;    //객체 복사
        System.out.println(newLoc.lat);
    }
}
