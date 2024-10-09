public class Test {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        System.out.println("Hallo Git. ");

        System.out.println("now it is the Git World. 19:00 exact time.");


        Player player = new Player();

        player.countUp();

        InterfaceCount ifc;
        ifc = player;

        ifc.countUp();

        

        System.out.println(player.countUp2());
    }
}