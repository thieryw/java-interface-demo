
public interface B {

    int TEST_ID = TestClass.getTestId();
    void foo();
    void foobar();

    default void go(){
        System.out.println("B: go");
    }

    static X[] copiesOfX(int n, X x){

        X[] out = new X[n];

        for(int i = 0; i < n; i++){
            out[i] = x;
        }

        return out;

    }

    static void printXArray(X[] x){

        for (X x2 : x) {
            System.out.println(x2.getId() + " : " + x2.getName());
        }
    }


    static boolean compareTwoXId(X x1, X x2){
        if(x1.getId() == x2.getId()){
            return true;
        }


        return false;
    }


}