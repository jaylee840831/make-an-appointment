package src;

import java.util.Arrays;

public class ArrayList {
    private Object[]list;
    private int next;
    public ArrayList(int i){
        this.list=new Object[i];
    }
    public ArrayList(){
        this(16);
    }
    public void add(Object o){
        if(next==this.list.length){
            this.list=Arrays.copyOf(this.list,this.list.length*2);
        }
        this.list[next++]=o;
    }
    public Object get(int index){
        return this.list[index];
    }
    public int size(){
        return next;
    }
    @Override
    public String toString(){
        String str="";
        for(int i=0;i<this.size()-1;i++){
            str+=this.get(i)+" ";
        }
        str+=this.get(this.size()-1);
        return str;
    }

}
