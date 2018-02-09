import java.util.ArrayList;

public class Example {
    public void something(){
        ArrayList list = new ArrayList();
        try{
            list.get(110);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Wow");
        }
    }

}
