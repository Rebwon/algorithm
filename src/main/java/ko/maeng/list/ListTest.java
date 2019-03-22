package ko.maeng.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hi"); //리스트에 추가
        list.add("Hello");
        list.add("NiHao");
        list.add("안녕하세요");

        System.out.println(list.contains("Hi"));    //리스트에 있는지 확인
        System.out.println(list.get(2));        //리스트에 2번째에 있는 값 반환
        System.out.println(list.size());        //리스트에 길이 반환
        list.set(2, "곤니찌와");        //리스트에 2번째에 있는 값을 바꿈
        System.out.println(list.get(2));
    }
}
