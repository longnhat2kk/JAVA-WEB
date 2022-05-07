package bai_10.danh_sach.bai_tap.util_arrayList.araylist_theo_thu_vien_java;

import bai_10.danh_sach.bai_tap.util_arrayList.araylist_theo_thu_vien_java.MyList;
import bai_10.danh_sach.bai_tap.util_arrayList.araylist_theo_thu_vien_java.Person;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Person> personMyList= new MyList<>();
        personMyList.add(new Person());
        personMyList.add(new Person());
        personMyList.add(new Person());
        personMyList.add(new Person());
        personMyList.add(new Person());

        MyList<Person> list2 = personMyList.clone();

        System.out.println(personMyList.get(1));
        System.out.println(personMyList.get(2));
    }

}