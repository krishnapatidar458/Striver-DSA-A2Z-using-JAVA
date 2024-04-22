import java.util.LinkedList;
import java.util.Iterator;
import java.util.Queue;
class llist{
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();
        ll.add(0);
        ll.add(2);
        ll.add(3);
        ll.add(5);
        ll2.add(6);
        ll2.add(8);
        System.out.println(ll);
        ll.add(1,1);
        ll.add(4,20);
        System.out.println(ll);
        ll.addAll(0,ll2);
        System.out.println(ll);
        ll.set(1,1);
        System.out.println(ll);
        System.out.println(ll.get(0));
        System.out.println(ll.indexOf(2));

        Iterator<Integer> it = ll.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+",");
        }
        System.out.println();
        for(int e:ll){
            System.out.print(e+",");
        }
        
    }
}