package ko.maeng.string;

import java.util.StringTokenizer;

public class StringTokenTest {
    public static void main(String[] args) {
        String s = "this is my time";
        StringTokenizer st = new StringTokenizer(s);    //문자열을 토큰으로 나누어줌. this, is, my, time 4개의 토큰이 생성됨.
        System.out.println(st.countTokens());   //토큰에 갯수를 반환
        while(st.hasMoreTokens()){  //토큰이 있는지 여부 확인
            System.out.println(st.nextToken()); //다음 토큰을 반환하고 이전 토큰을 제거.
        }
        System.out.println(st.countTokens());

        String abs = "this%is%my%time";
        StringTokenizer str = new StringTokenizer(abs, "%");    //문자열을 토큰으로 나누되, %를 기준으로 나눠줌.
        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }
    }
}
