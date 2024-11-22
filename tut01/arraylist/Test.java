package tut01.arraylist;

public class Test {
    public static void main(String[] args) {
        MaxMinInList list = new MaxMinInList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.min() + " " + list.max());
    }
}
