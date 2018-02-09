public class ExampleHelper {
    int a;
    ExampleHelper(int a){
        this.a = a;
    }
    public int giveAplus() throws Exception{//yes, method signature THROWS checked exception
        return a+1;//yes, we DON'T throw exception in this method.
    }
}
