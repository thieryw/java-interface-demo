public abstract class AbstractA implements A, C, Cloneable {


    public void foo(){
        System.out.println("foo");
    }

    public void foobarFoobar(){
        System.out.println("foobarFoobar");;
    }
    
    public abstract void barFoo();

    public void hello(){
        System.out.println("hello");
    }

    public void helloWorld(){
        System.out.println("hello world");
    }

    public C clone(){
        try{
            return (C) super.clone();
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        return null;
    }



}