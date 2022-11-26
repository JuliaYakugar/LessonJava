import java.util.Arrays;
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

        String str1 = "Привет Юля";
        String str2 = "ялЮ тевирП";
        for (int i = 0; i < str1.length(); i++) {
            if ((str1.charAt(i)) != (str2.charAt(str1.length()-i-1))) {
                System.out.println("Не является переворотом");
                break;
            } else if (i == (str1.length()-1)) {
                System.out.println("Является переворотом");
            }
        }

        class Recurs {
            public static String recurs(String str) {
                if (str.length() <= 1) {
                    return str;
                }
                return recurs(str.substring(1)) + str.charAt(0);
            }
        }

        String str3 = "Привет Юля";
        System.out.println(Recurs.recurs(str3));

        int a = 3;
        int b = 56;

        StringBuilder sb = new StringBuilder();
        sb.append(a + " + " + b + " = " + (a+b) + "\n");
        sb.append(a + " - " + b + " = " + (a-b) + "\n");
        sb.append(a + " * " + b + " = " + (a*b));
        System.out.println(sb);

        String str5 = "Строка, в которой есть = и еще много других символов";
        StringBuilder str5Sb = new StringBuilder(str5);
        int indexRavno = str5Sb.indexOf("=");
        str5Sb.deleteCharAt(indexRavno);
        str5Sb.insert(indexRavno, "равно");
        System.out.println(str5Sb);

        String str6 = "Строка, в которой есть = и еще много других символов";
        StringBuilder str6Sb = new StringBuilder(str6);
        int indexRavno6 = str6Sb.indexOf("=");
        str6Sb.replace(indexRavno6, indexRavno6+1, "равно");
        System.out.println(str6Sb);
    }
    
}