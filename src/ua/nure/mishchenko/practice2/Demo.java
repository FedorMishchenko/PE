package ua.nure.mishchenko.practice2;

import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        System.out.println("==== Part1");
        Array list = new ArrayImpl();
        // [A, A2]
        list.add("A");
        list.add("A2");
        System.out.println(list);

        // 2
        System.out.println(list.size());
        // []
        list.clear();
        System.out.println(list);

        String a2 = "A2";
        a2 += "";
        // [A, null]
        list.add("A");
        list.add(null);
        list.add(a2);
        list.add("A3");
        System.out.println(list);
        // 2
        System.out.println(list.indexOf(a2));
        // 1
        System.out.println(list.indexOf(null));
        // [A, A2]
        list.remove(3);
        list.remove(1);
        System.out.println(list);

        // AA2
        for (Object el : list) {
            System.out.print(el);
        }
        System.out.println();

        System.out.println("==== Part2");

        list = new ArrayImpl();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // 1 2 3 4
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        // [1, 3, 4]
        it = list.iterator();
        it.next();
        it.next();
        it.remove();
        System.out.println(list);

        // 3
        System.out.println(it.next());

        // [1, 4]
        it.remove();
        System.out.println(list);

        // class java.lang.IllegalStateException
        try {
            it.remove();
        } catch (IllegalStateException ex) {
            System.out.println(ex.getClass());
        }

        list.add(null);
        //true
        System.out.println(list.contains(null));
        //true
        System.out.println(list.contains(1));
        //false
        System.out.println(list.contains("A"));


        Array list2 = new ArrayImpl();
        list2.add(1);
        list2.add(null);
        //true
        System.out.println(list.containsAll(list2));

        list2.add(123);
        //false
        System.out.println(list.containsAll(list2));

        list2.clear();
        list2.add(null);
        //NULL
        System.out.println(list2);
        //123
        list2.set(0,123);
        System.out.println(list2);
    }
}
