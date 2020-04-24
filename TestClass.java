public class TestClass{

    public static int getTestId(){
        return 3;
    }

    public void lambdaTest(FunctionalInterface f){
        f.test();
    }






    public static void main(String[] args) {
        
        X x = new X();

        x.bar();

        x.setId(1);
        x.setName("william's X");

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



        x.go();

        Y y = new Y();


        y.go();

        

        new TestClass().lambdaTest(() -> System.out.println("functional interface test"));


        FunctionalInterface1 f = (int[] intArray) -> {
            for (int z : intArray) {
                System.out.println(z);
            }
        };


        f.intArrayDisplay(new int[]{1,2,3,4});
            
        
        X[] xArray = B.copiesOfX(12, x);

        B.printXArray(xArray);


        A a = new X();

        B b = new X();

        ((X)a).setId(3);

        ((X)b).setId(2);


        System.out.println(B.compareTwoXId((X)a, (X)b));

        A.printNameAndId((X)a);

        A.printNameAndId((X)b);

        A.printNameAndId((X)c);

            






        
        
    }




}