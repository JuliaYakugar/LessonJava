import java.util.Random;

public class program {
    public static void main(String[] args) {
        
        int i = new Random().nextInt((1000 - (-1000)) + 1) + (-1000);
        System.out.println("1. Рандомное число: " + i);

    }
    
}