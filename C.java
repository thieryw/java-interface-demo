
public interface C{
    void hello();
    void helloWorld();

    default void go(){
        System.out.println("C: go");
    }



}
