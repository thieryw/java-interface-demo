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

        C c = new X();

        ((X)c).setId(12);
        ((X)c).setName("john doe");


        C c1;

        c1 = ((X)c).clone();

        System.out.println(((X)c).getId() + " : " + ((X)c).getName());

        System.out.println(((X)c1).getId() + " : " + ((X)c1).getName());


        System.out.println((c == c1) + "; they do not hove the same memory address, two objects that are identical");
        
        
        
        
    }




}