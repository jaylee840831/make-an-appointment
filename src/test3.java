package src;

import src.ArrayList;

public class test3{

public static void main(String[] args) {
 
    ArrayList list=new ArrayList();
    list.add(1);
    list.add(3);
    list.add(5);
    list.add(7);
    list.add(9);
    
    System.out.println(list);

    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }


}

}