
public interface B {

    int TEST_ID = TestClass.getTestId();
    void foo();
    void foobar();

    default void go(){
        System.out.println("B: go");
    }

}