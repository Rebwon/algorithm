package ko.maeng.set;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();  //중복 허용하지 않고 순서 보장 X
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");

        System.out.println(set.size());

        Iterator<String> it = set.iterator();   //반복자 생성

        while(it.hasNext()){    //데이터가 있다면 ? true : false
            System.out.println(it.next());  //데이터 리턴
        }

        System.out.println("---------------------------------");

        Set<Integer> intSet = new TreeSet<>();  //TreeSet은 기본적으로 중복 허용하지 않고 오름차순 정렬
        intSet.add(5);
        intSet.add(3);
        intSet.add(4);
        intSet.add(1);
        intSet.add(2);

        Iterator<Integer> intIt = intSet.iterator();
        while(intIt.hasNext()){
            System.out.println(intIt.next());
        }

        System.out.println("-----------------------------------");

        Set<String> linkSet = new LinkedHashSet<>();    //중복 허용하지 않으며 입력된 순서대로 데이터 관리
        linkSet.add("solomon");
        linkSet.add("maeng");
        linkSet.add("kim");
        linkSet.add("brown");
        linkSet.add("baby");

        Iterator<String> iterator = linkSet.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
