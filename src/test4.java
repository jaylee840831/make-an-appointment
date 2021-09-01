package src;

class Resource implements AutoCloseable{
        void doSome(){
            System.out.println("do something");
        }
        @Override
        public void close() throws Exception{
            System.out.println("close resource");
        }
    }
public class test4 {
    public static void main(String[] args) {
        try(Resource resource=new Resource()){
            resource.doSome();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        System.out.println();

        try{
            Resource resource=new Resource();
            resource.doSome();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
