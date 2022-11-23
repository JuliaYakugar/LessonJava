import java.util.Random;

public class program {
    public static void main(String[] args) {
        
        int i = new Random().nextInt((1000 - (-1000)) + 1) + (-1000);
        System.out.println("1. Рандомное число: " + i);

        int i2 = i;
        if (i2 < 0) i2 *= -1;
        int n = Integer.highestOneBit(i2);
        System.out.println("2. Старший значащий бит: " + n);

        String strKrat = "";
        for(int j = i; j < Short.MAX_VALUE; j++) {
            if (j%n == 0) {
                strKrat += j + " ";
            }
        }

        String[] m1 = strKrat.split(" ");

        System.out.println("3. Массив m1: ");
        for(int k=0; k<m1.length; k++) {
            System.out.print(m1[k] + " ");
        }
        System.out.println();

    }
    
}