public class TestClass{

    public static int getTestId(){
        return 3;
    }


    public static void main(String[] args) {
        
        X x = new X();

        x.bar();

        System.out.println(A.VAL);

        System.out.println(AbstractA.VAL);

        x.bar();

        x.barFoo();

        x.foo();

        x.foobar();

        x.hello();

        x.helloWorld();

        System.out.println(B.TEST_ID);
        
        
        
    }




}