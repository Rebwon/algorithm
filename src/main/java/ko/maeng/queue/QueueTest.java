package ko.maeng.queue;

import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    //Queue 먼저 들어온 것이 먼저 나가는 FIFO(First In First Out) 구조를 가진다.
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(6);
        queue.add(5);
        queue.add(4);

        System.out.println(queue.peek());

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
