import java.util.ArrayList;

public class Example {
    public void something(){
        int [] array = new int[(int)Math.random()*1000];
        try{
            int i = array[(int)Math.random()*1000];
        } catch (IndexOutOfBoundsException e){
            System.out.println("Wow");
        }
    }

}
