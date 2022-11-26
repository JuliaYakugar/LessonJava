import java.util.Random;

public class program {
    public static void main(String[] args) {
        
        // int i = new Random().nextInt((1000 - (-1000)) + 1) + (-1000);
        // System.out.println("1. Рандомное число: " + i);

        // int i2 = i;
        // if (i2 < 0) i2 *= -1;
        // int n = Integer.highestOneBit(i2);
        // System.out.println("2. Старший значащий бит: " + n);

        // String strKrat = "";
        // for(int j = i; j < Short.MAX_VALUE; j++) {
        //     if (j%n == 0) {
        //         strKrat += j + " ";
        //     }
        // }

        // String[] m1 = strKrat.split(" ");

        // System.out.println("3. Массив m1: ");
        // for(int k=0; k<m1.length; k++) {
        //     System.out.print(m1[k] + " ");
        // }
        // System.out.println();

        // String strNeKrat = "";
        // for(int j = Short.MIN_VALUE; j < i; j++) {
        //     if (j%n != 0) {
        //         strNeKrat += j + " ";
        //     }
        // }

        // String[] m2 = strNeKrat.split(" ");

        // System.out.println("4. Массив m2: ");
        // for(int k=0; k<m2.length; k++) {
        //     System.out.print(m2[k] + " ");
        // }

        String str = "Тут текст, а текст этот про текст с текстом.";
        String strMini = "текст";
        int indexMini = str.indexOf(strMini);
        System.out.println("Наименьший индекс вхождения: " + indexMini);
    }
    
}