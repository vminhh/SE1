package tut01;

public class MaxMinIntListTest {
    public static void main(String[] args) {
        MaxMinIntList list = new MaxMinIntList();
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(9);
        System.out.println(list.min() + " " + list.max());
    }
}
