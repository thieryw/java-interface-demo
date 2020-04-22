
public class X extends AbstractA implements B {

    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void bar(){
        System.out.println("bar");
    }

    public void foobar(){
        System.out.println("foobar");
    }

    public void barFoo(){
        System.out.println("barFoo");
    }

    public void go(){
        B.super.go();
    }

    public X clone(){
        X out;

        try{
            out = (X) super.clone();
        }catch(CloneNotSupportedException e){
            throw new RuntimeException(e.getMessage());
        }
        return out;
    }
        



    

}