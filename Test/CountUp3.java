public class CountUp3 {

    int value;

    public CountUp3 (){
        this.value = 0;
    }

    public int countUp (){
        value += 3;
        System.out.println(value);
        return value;
    }

    public int countDown(){
        value += 4;
        System.out.println(value);
        return value;
    }


}
