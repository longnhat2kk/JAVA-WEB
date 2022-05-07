package bai_10.danh_sach.bai_tap.linked_list;

public class TestMyLinkedList {

    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student(int id) {
                this.id = id;
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        MyLinkedList<Student> myLinkList = new MyLinkedList<>();
        Student student1 = new Student(1,"Nhat1");
        Student student2 = new Student(1,"Nhat2");
        Student student3 = new Student(1,"Nhat3");
        Student student4 = new Student(1,"Nhat4");

        myLinkList.addFirst(student1);
        myLinkList.addFirst(student2);
        myLinkList.addLast(student3);
        myLinkList.add(3,student4);
        for(int i = 0; i< myLinkList.size(); i++){
            Student student = (Student) myLinkList.get(i);
            System.out.println(student.getName());
        }
    }
}
