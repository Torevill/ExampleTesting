public class HarderExample {
    public void something(){
        ExampleHelper exampleHelper = new ExampleHelper(5);
        try{
            int i = exampleHelper.giveAplus();
        } catch (Exception e){
            System.out.println("Wow");
        }
    }
}
