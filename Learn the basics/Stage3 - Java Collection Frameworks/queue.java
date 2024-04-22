import java.util.Queue;
import java.util.LinkedList;
import java.util.Collection;
class queue{
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q1 = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        System.out.println(q);
        q.poll();
        q1.offer(12);
        q1.offer(13);
        q1.offer(14);
        q.addAll(q1);
        System.out.println(q);
        System.out.println(q.peek());

    }
}