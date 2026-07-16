
public class GenerateRandomNumber {

    public static void main(String[] args) {

        double ran = Math.random();
        System.out.println(ran);

        long random = System.currentTimeMillis() / 1000;
        System.out.println(random);
    }
}