import java.util.*;
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

        // String str = "Тут текст, а текст этот про текст с текстом.";
        // String strMini = "текст";
        // int indexMini = str.indexOf(strMini);
        // System.out.println("Наименьший индекс вхождения: " + indexMini);

        // String str1 = "Привет Юля";
        // String str2 = "ялЮ тевирП";
        // for (int i = 0; i < str1.length(); i++) {
        //     if ((str1.charAt(i)) != (str2.charAt(str1.length()-i-1))) {
        //         System.out.println("Не является переворотом");
        //         break;
        //     } else if (i == (str1.length()-1)) {
        //         System.out.println("Является переворотом");
        //     }
        // }

        // class Recurs {
        //     public static String recurs(String str) {
        //         if (str.length() <= 1) {
        //             return str;
        //         }
        //         return recurs(str.substring(1)) + str.charAt(0);
        //     }
        // }

        // String str3 = "Привет Юля";
        // System.out.println(Recurs.recurs(str3));

        // int a = 3;
        // int b = 56;

        // StringBuilder sb = new StringBuilder();
        // sb.append(a + " + " + b + " = " + (a+b) + "\n");
        // sb.append(a + " - " + b + " = " + (a-b) + "\n");
        // sb.append(a + " * " + b + " = " + (a*b));
        // System.out.println(sb);

        // String str5 = "Строка, в которой есть = и еще много других символов";
        // StringBuilder str5Sb = new StringBuilder(str5);
        // int indexRavno = str5Sb.indexOf("=");
        // str5Sb.deleteCharAt(indexRavno);
        // str5Sb.insert(indexRavno, "равно");
        // System.out.println(str5Sb);

        // String str6 = "Строка, в которой есть = и еще много других символов";
        // StringBuilder str6Sb = new StringBuilder(str6);
        // int indexRavno6 = str6Sb.indexOf("=");
        // str6Sb.replace(indexRavno6, indexRavno6+1, "равно");
        // System.out.println(str6Sb);

        // String str7 = "";
        // for (int i = 0; i<10000; i++) {
        //     if (i%10 == 0) {
        //         str7 += "=";
        //     } else {
        //         str7 += new Random().nextInt(10);
        //     }
        // }
        // StringBuilder str7Sb = new StringBuilder(str7);

        // long start = System.currentTimeMillis();
        // while (str7.contains("=")) {
        //     str7 = str7.replace("=", "равно");
        // }
        // System.out.println("String: " + (System.currentTimeMillis() - start));
        
        // long start2 = System.currentTimeMillis();
        // while ((str7Sb.indexOf("=")) != -1) {
        //     int indexRavno7 = str7Sb.indexOf("=");
        //     str7Sb.replace(indexRavno7, indexRavno7+1, "равно");
        // }
        // System.out.println("StringBuilder: " + (System.currentTimeMillis() - start2));
        
        
        // // 1. Создать новый список, добавить несколько строк и вывести коллекцию на экран
        // ArrayList<String> str = new ArrayList<String>();
        // str.add("Синий");
        // str.add("Красный");
        // str.add("Черный");
        // str.add("Белый");
        // str.add("Зеленый");

        // printStr(str);

        // // 2. Итерация всех элементов списка цветов и добавления к каждому символа '!'
        // for (int i=0; i < str.size(); i++) {
        //     str.set(i, str.get(i) + "!");
        // }

        // printStr(str);

        // // 3. Вставить элемент в список в первой позиции
        // str.add(1, "Серый");

        // printStr(str);

        // // 4. Извлечь элемент (по указанному индексу) из заданного списка
        // System.out.print(str.get(3));

        // System.out.println();

        // // 5. Обновить определенный элемент списка по заданному индексу
        // str.set(2, "Фиолетовый");

        // printStr(str);

        // // 6. Удалить третий элемент из списка
        // str.remove(3);

        // printStr(str);

        // // 7. Поиска элемента в списке по строке
        // System.out.print(str.indexOf("Белый!"));
        // System.out.println();

        // // 8. Создать новый список и добавить в него несколько елементов первого списка
        // ArrayList<String> strNew = new ArrayList<String>();
        // strNew.add(str.get(0));
        // strNew.add(str.get(4));

        // printStr(strNew);

        // // 9. Удалить из первого списка все элементы отсутствующие во втором списке
        // str.retainAll(strNew);

        // printStr(str);

        // // 10. *Сортировка списка
        // Collections.sort(str);

        // printStr(str);

        // //11. *Сравнить время работы пункта 3 для ArrayList и LinkedList
        // List<String> linkedList = new LinkedList<String>(str);

        // long start = System.currentTimeMillis();
        // str.add(1, "Голубой");
        // System.out.println(System.currentTimeMillis() - start);

        // start = System.currentTimeMillis();
        // linkedList.add(1, "Голубой");
        // System.out.println(System.currentTimeMillis() - start);

        ArrayList<String> list_fname = new ArrayList<>();
        ArrayList<String> list_lname = new ArrayList<>();
        ArrayList<String> list_tname = new ArrayList<>();
        ArrayList<Integer> list_age = new ArrayList<>();
        ArrayList<Boolean> list_gender = new ArrayList<>();
        ArrayList<Integer> list_id = new ArrayList<>();
        
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            Scanner scanner_age = new Scanner(System.in);
            Scanner scanner_gender = new Scanner(System.in);

            System.out.println("Введите ФИО: ");
            String fio = scanner.nextLine();
            String[] fio1 = fio.split(" ");
            if (fio1.length == 3) {
                list_fname.add(fio1[1]);
                list_lname.add(fio1[0]);
                list_tname.add(fio1[2]);
            } else if (fio1.length == 2) {
                list_fname.add(fio1[0]);
                list_lname.add(fio1[1]);
                list_tname.add("");
            } else {
                list_fname.add(fio1[0]);
                list_lname.add("");
                list_tname.add("");
            }

            System.out.println("Введите возраст: ");
            Integer age = scanner_age.nextInt();
            list_age.add(age);

            System.out.println("Введите пол M/F: ");
            String gender = scanner_gender.nextLine();
            if (gender.toUpperCase().equals("M")) {
                list_gender.add(false);
            } else if (gender.toUpperCase().equals("F")) {
                list_gender.add(true);
            }
            
            if (list_id.size() == 0) {
                list_id.add(0);
            } else {
                Integer index = list_id.get(list_id.size()-1);
                list_id.add(index + 1);
            }

            System.out.println("Хотите добавить еще одного человека? Y/N");
            Scanner scanner1 = new Scanner(System.in);
            String yn = scanner1.nextLine();
            if(yn.toUpperCase().equals("N")) {
                flag = false;
            }
        }

        int sizeBd = list_id.size() - 1;
        while (sizeBd >= 0) {
            Boolean fmale = list_gender.get(list_id.get(sizeBd));
            int index = sizeBd;
            for (int i = 0; i < sizeBd; i++) {
                if (list_gender.get(list_id.get(sizeBd)) == true) {
                    fmale = list_gender.get(list_id.get(i));
                    index = i;
                }
            }
            int tmp_id = list_id.get(sizeBd);
            list_id.set(sizeBd, list_id.get(index));
            list_id.set(index, tmp_id);

            String tmp_fname = list_fname.get(sizeBd);
            list_fname.set(sizeBd, list_fname.get(index));
            list_fname.set(index, tmp_fname);

            String tmp_lname = list_lname.get(sizeBd);
            list_lname.set(sizeBd, list_lname.get(index));
            list_lname.set(index, tmp_lname);

            String tmp_tname = list_tname.get(sizeBd);
            list_tname.set(sizeBd, list_tname.get(index));
            list_tname.set(index, tmp_tname);

            int tmp_age = list_age.get(sizeBd);
            list_age.set(sizeBd, list_age.get(index));
            list_age.set(index, tmp_age);

            Boolean tmp_gender = list_gender.get(sizeBd);
            list_gender.set(sizeBd, list_gender.get(index));
            list_gender.set(index, tmp_gender);

            sizeBd--;
        }

        for (int i = 0; i < list_id.size(); i++) {
            System.out.println("ID: " + list_id.get(i) + "; Имя: " + list_fname.get(i) + "; Фамилия: " + list_lname.get(i) + "; Отчество: " + list_tname.get(i) + "; Возраст: " + list_age.get(i) + "; Пол: " + list_gender.get(i));
        }

    }

    // public static void printStr(ArrayList str) {
    //     for (Object o: str) {
    //         System.out.print(o + " ");
    //     }

    //     System.out.println();
    // }
    
}