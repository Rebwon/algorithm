package ko.maeng.string;

public class StringTest {
    public static void main(String[] args) {
        String s = " Hello World ";
        String name = "rebwon";
        System.out.println(name.replace("r","l"));  //문자열 r을 l로 변경
        System.out.println(name.substring(0,3));    //시작인덱스의 문자열부터 마지막 인덱스 문자열 전까지 출력
        System.out.println(name.length());  //문자열 길이 출력
        System.out.println(name.charAt(2)); //2번째 인덱스의 char형 출력 rebwon에서 b출력
        System.out.println(s.trim());   //앞뒤 공백 제거
        System.out.println(name.concat(" Hi")); //문자열 붙이기
        System.out.println(name.contains("w")); //문자열에 특정 문자열이 있는지 확인
        System.out.println(name.indexOf("o"));  //특정 문자열의 위치를 int로 반환
    }
}
