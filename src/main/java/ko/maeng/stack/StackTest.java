package ko.maeng.stack;

import java.util.Stack;

public class StackTest {
    //스택은 사전적으로 '더미', '쌓아 올림'이라는 의미를 가진다.
    //스택은 데이터를 쌓아올리는 형태로 저장하여 추출할 때는 맨 위에 있는 데이터를 먼저 꺼내는 형식이기 때문에
    //제일 마지막에 저장한 데이터를 제일 먼저 꺼내는 후입선출(LIFO - Last In First Out)형태의 자료구조이다.
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(7);      //스택에 7삽입
        stack.push(5);
        stack.push(4);
        stack.pop();
        stack.push(6);
        stack.pop();

        System.out.println(stack.peek());   //가장 최근에 보관한 값(5) 출력
        System.out.println(stack.search(7));

        System.out.println("----------------------------------");

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
