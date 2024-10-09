public class Player implements InterfaceCount{

    String name;

    String type;

    int max = 10;

    int value = 0;

    String message = "This is the last message, can not go over 12.";

    

    @Override
    public int countUp() {
        value += 2;
        System.out.println(value);
        return value;
    }

    
    
    



}
