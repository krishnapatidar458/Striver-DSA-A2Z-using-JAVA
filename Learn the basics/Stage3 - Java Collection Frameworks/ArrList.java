import java.util.ArrayList;
import java.util.Iterator;
class ArrList{
    public static void main(String[] args){
        ArrayList<Integer> list  = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(1,1);
        System.out.println(list);
        

        list.set(2,20);
        System.out.println(list);
        System.out.println(list.contains(200));
        System.out.println(list.size());

        for(int i :list){
            System.out.print(i+",");
        }
        System.out.println("");
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+",");
        }
        System.out.println();
        list2.add(11);
        list2.add(12);
        System.out.println(list2);
        list.addAll(0,list2);
        System.out.println(list);
        list.remove(3);
        list.remove(Integer.valueOf(0));
        list.clear();
    }
}