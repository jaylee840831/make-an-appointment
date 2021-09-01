package src;

import java.util.*;
import java.util.ArrayList;

class Student implements Comparable{
    private String name;
    private String number;
    private int balance;
    Student(String name,String number,int balance){
        this.name=name;
        this.number=number;
        this.balance=balance;
    }
    @Override
    public int compareTo(Object o){
        Student student=(Student)o;
        return this.balance-student.balance;
    }
    public String getName(){
        return this.name;
    }
    public String getNumber(){
        return this.number;
    }
    public int getBalance(){
        return this.balance;
    }
}

public class test5 {
    public static void main(String[] args) {
        // Student student1=new Student("小名","g123",7000);
        // Student student2=new Student("小美","g111",5000);
        // Student student3=new Student("小智","g321",8000);
        // System.out.println(student1.getClass());
        // System.out.println(student2.getClass());
        // System.out.println(student3.getClass());
        List<Student> list=Arrays.asList(new Student("小名","g123",7000),new Student("小美","g111",5000),new Student("小智","g321",8000));
        List<Student> s=new ArrayList<>(list);
        s.add(new Student("小陳","g222",2000));
        Collections.sort(s);
        for(Object o:s){
            System.out.print(((Student)o).getName()+" "+((Student)o).getNumber()+" "+((Student)o).getBalance()+" , ");
        }

        System.out.println();

        List list2=Arrays.asList("banana","zoo","apple","lemon","zero","bird");
        Collections.sort(list2);
        System.out.println(list2);
    }
}
