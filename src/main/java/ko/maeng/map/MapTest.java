package ko.maeng.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Rebwon");
        map.put(2, "Jay");
        map.put(3, "lion");
        map.put(4, "john"); //키, 값으로 이루어져있는 자료구조로써 입력받을 때도 키, 값으로 구분한다.

        System.out.println(map.get(2)); //키값인 2를 넣었을 때 Jay가 출력.
        System.out.println(map.containsKey(3)); //키값 3이 있는지 확인
        System.out.println(map.containsValue("lion"));  //lion이 있는지 확인
        Set<Integer> set = map.keySet();   //키값만 set자료구조로 반환
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
}
