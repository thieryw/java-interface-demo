public interface A{

    int VAL = 12;

    void foo();
    void bar();

    default void go(){
        System.out.println("A: go");
    }
   
}
