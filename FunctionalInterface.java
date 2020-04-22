
public interface FunctionalInterface {
    /*
    functional interfaces must contain only one abstract method.
    it is possible however to introduce one or more default methods.
    */

    default void test1(){}

    default void test2(){}

    void test();

}